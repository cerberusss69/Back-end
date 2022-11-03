import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {"item", "parse"})

@Data
public class AddtoShoppingList {
    @JsonProperty("item")
    private String item;
    @JsonProperty("parse")
    private String parse;
}
