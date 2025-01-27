spring.servlet.multipart.enabled=true
spring.servlet.multipart.max-file-size=10MB
spring.servlet.multipart.max-request-size=10MB


..........................


Mapping("/api/files")
public class FileUploadController {

    @Operation(
        summary = "Upload a file with a mandatory header",
        tags = {"data-transformation"},
        parameters = {
            @io.swagger.v3.oas.annotations.Parameter(
                in = io.swagger.v3.oas.annotations.enums.ParameterIn.HEADER,
                name = "id",
                required = true,
                description = "Unique ID for the operation",
                schema = @Schema(type = "string")
            )
        },
        requestBody = @RequestBody(
            description = "Upload file",
            required = true,
            content = @Content(
                mediaType = "multipart/form-data",
                schema = @Schema(
                    type = "object",
                    properties = {
                        @SchemaProperty(name = "scriptFile", schema = @Schema(type = "string", format = "binary"))
                    }
                )
            )
        )
    )



................................................................


@Operation(
        summary = "Upload a file with a mandatory header",
        requestBody = @RequestBody(
            content = @Content(
                mediaType = "multipart/form-data",
                schema = @Schema(
                    type = "object",
                    properties = {
                        @Schema(name = "scriptFile", type = "string", format = "binary")
                    }
                )
            )
        )
    )

    ......................................................


     @Operation(
        summary = "Upload a file with a mandatory header",
        requestBody = @RequestBody(
            content = @Content(
                mediaType = "multipart/form-data",
                schema = @Schema(
                    type = "object",
                    example = "{ \"scriptFile\": \"<binary data>\" }"
                )
            )
        )
    )
