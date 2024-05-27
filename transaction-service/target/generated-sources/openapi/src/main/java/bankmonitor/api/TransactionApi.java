/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package bankmonitor.api;

import bankmonitor.api.model.Transaction;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-27T16:55:21.508764211Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@Validated
@Tag(name = "transaction", description = "the transaction API")
public interface TransactionApi {

    /**
     * GET /transactions : Get all transactions 
     *
     * @return transaction details (status code 200)
     */
    @Operation(
        operationId = "readTransactions",
        summary = "Get all transactions ",
        tags = { "transaction" },
        responses = {
            @ApiResponse(responseCode = "200", description = "transaction details", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Transaction.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/transactions",
        produces = { "application/json" }
    )
    
    ResponseEntity<List<Transaction>> _readTransactions(
        
    );


    /**
     * PUT /transactions/{id} : Update an existing transaction record 
     *
     * @param id  (required)
     * @param body Raw transaction data (required)
     * @return transaction details (status code 200)
     *         or Bad request. Id not found. (status code 400)
     */
    @Operation(
        operationId = "updateTransaction",
        summary = "Update an existing transaction record ",
        tags = { "transaction" },
        responses = {
            @ApiResponse(responseCode = "200", description = "transaction details", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Transaction.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request. Id not found.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/transactions/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    ResponseEntity<Transaction> _updateTransaction(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "body", description = "Raw transaction data", required = true) @Valid @RequestBody String body
    );

}