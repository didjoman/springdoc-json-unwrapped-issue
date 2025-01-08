# springdoc-json-unwrapped-issue

When a field with ``@JsonUnwrapped`` has an ``@Schema`` annotation, it appears in the doc from v2.8.1, it wasn't the case in v2.7.0.
See Cat.attributes in the generate Open Api Specification:

```json
{
  "openapi": "3.1.0",
  "info": {
    "title": "OpenAPI definition",
    "version": "v0"
  },
  "servers": [
    {
      "url": "http://localhost:8080",
      "description": "Generated server url"
    }
  ],
  "paths": {
    "/cat": {
      "get": {
        "tags": [
          "basic-controller"
        ],
        "summary": "get",
        "description": "Provides an animal.",
        "operationId": "get",
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/Cat"
                }
              }
            }
          }
        }
      }
    }
  },
  "components": {
    "schemas": {
      "Cat": {
        "type": "object",
        "description": "Represents a Cat class.",
        "properties": {
          "color": {
            "$ref": "#/components/schemas/Color"
          },
          "attributes": {
            "description": "The attributes."
          }
        }
      },
      "Color": {
        "type": "object",
        "properties": {
          "value": {
            "type": "string"
          }
        }
      }
    }
  }
}
```
