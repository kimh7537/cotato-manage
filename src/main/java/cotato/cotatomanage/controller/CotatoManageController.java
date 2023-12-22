package cotato.cotatomanage.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CotatoManageController {

    private final CotatoManageService cotatoManageService;


}
