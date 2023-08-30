import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sacral.entity.User;
import com.sacral.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/verifyFileFormat", method = RequestMethod.POST)
	@ResponseBody
	public void verifyFileFormat(@RequestParam String fileFormat) {
		userService.verifyFileFormat(fileFormat);
	}

	@RequestMapping(value = "/evaluateCreditworthiness", method = RequestMethod.POST)
	@ResponseBody
	public void evaluateCreditworthiness(@RequestParam int income, @RequestParam String employmentStatus) {
		userService.evaluateCreditworthiness(income, employmentStatus);
	}

	@RequestMapping(value = "/checkAge", method = RequestMethod.POST)
	@ResponseBody
	public void checkAge(@RequestParam int age) {
		userService.checkAge(age);
	}

	@RequestMapping(value = "/checkCreditScore", method = RequestMethod.POST)
	@ResponseBody
	public void checkCreditScore(@RequestParam int creditScore) {
		userService.checkCreditScore(creditScore);
	}

	@RequestMapping(value = "/defineDisbursementLogic", method = RequestMethod.POST)
	@ResponseBody
	public void defineDisbursementLogic(@RequestParam int loanAmount) {
		userService.defineDisbursementLogic(loanAmount);
	}

	@RequestMapping(value = "/defineUserRolesAndPermissions", method = RequestMethod.POST)
	@ResponseBody
	public void defineUserRolesAndPermissions(@RequestParam String role, @RequestParam String permission) {
		userService.defineUserRolesAndPermissions(role, permission);
	}

	@RequestMapping(value = "/addEditDeleteRecipientProfiles", method = RequestMethod.POST)
	@ResponseBody
	public void addEditDeleteRecipientProfiles(@RequestParam String name, @RequestParam String email, 
			@RequestParam String bankAccountDetails) {
		userService.addEditDeleteRecipientProfiles(name, email, bankAccountDetails);
	}
	
}