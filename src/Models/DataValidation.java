/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Models;

/**
 *
 * @author Ishara Sahan
 */
public enum DataValidation {
    
    VALIDATE_EMAIL {
        
        @Override
        public String isValidation() {
            return "^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@[^-][A-Za-z0-9\\+-]+"
                    + "(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$";
        }
    }, VALIDATE_MOBILE {
        
        @Override
        public String isValidation() {
            return "^(0{1})(7{1})([0|1|2|4|5|6|7|8]{1})([0-9]{7})";
        }
    }, VALIDATE_MOBILE_AND_LAND {
        
        @Override
        public String isValidation() {
            return "^(?:0|94|\\+94|0094)?(?:(11|21|23|24|25|26|27|31|32|33|34|35|36|37|38|41|"
                    + "45|47|51|52|54|55|57|63|65|66|67|81|91)(0|2|3|4|5|7|9)|7(0|1|2|4|5|6|7|8)\\d)\\d{6}$";
        }
    }, VALIDATE_PASSWORD {
        
        @Override
        public String isValidation() {
            return "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
        }
    },VALIDATE_NIC {
        
        @Override
        public String isValidation() {
            return "^([0-9]{9}[vVxX]|[0-9]{12})$";
        }
    };

    public String isValidation() {
        return "";
    }
}
