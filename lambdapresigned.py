import boto3
import json
import os

s3_client = boto3.client('s3')

def lambda_handler(event, context):
    # Extract bucket name and object key from the event
    bucket_name = event['bucket_name']
    object_key = event['object_key']
    
    # Generate the presigned URL
    try:
        presigned_url = s3_client.generate_presigned_url(
            'put_object',
            Params={'Bucket': bucket_name, 'Key': object_key},
            ExpiresIn=3600  # URL expiration time in seconds
        )
    except Exception as e:
        return {
            'statusCode': 500,
            'body': json.dumps(f"Error generating presigned URL: {str(e)}")
        }
    
    # Return the presigned URL
    return {
        'statusCode': 200,
        'body': json.dumps({'presigned_url': presigned_url})
    }