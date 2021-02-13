package softuni.demo.model.binding;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import java.math.BigDecimal;

public class UserRegisterBindingModel {

    private String username;
    private String email;
    private BigDecimal budget;
    private String password;
    private String confirmPassword;

    public UserRegisterBindingModel() {
    }
    @Length(min=2, message = "Username length must be more than two characters")
    public String getUsername() {
        return username;
    }

    public UserRegisterBindingModel setUsername(String username) {
        this.username = username;
        return this;
    }
    @Email(message = "Email must contain '@'")
    public String getEmail() {
        return email;
    }

    public UserRegisterBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }
    @DecimalMin(value="0", message = "Budget must be a positive number")
    public BigDecimal getBudget() {
        return budget;
    }

    public UserRegisterBindingModel setBudget(BigDecimal budget) {
        this.budget = budget;
        return this;
    }
    @Length(min=2, message ="Password length must be more than two characters")
    public String getPassword() {
        return password;
    }

    public UserRegisterBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UserRegisterBindingModel setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }
}
