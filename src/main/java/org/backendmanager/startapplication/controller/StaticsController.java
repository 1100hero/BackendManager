package org.backendmanager.startapplication.controller;

import org.backendmanager.startapplication.dto.PlayerDTO;
import org.backendmanager.startapplication.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/statistics")
public class StaticsController {

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/total-points")
    public List<PlayerDTO> countTotalPoints() {
        return playerRepository.getTotalPoints();
    }

    @GetMapping("/{username}-points")
    public Integer countTotalPointsOfPlayer(@PathVariable("username") String username) {
        return playerRepository.getTotalPointsOfPlayer(username);
    }

    @PostMapping("/addPoints-{username}-{amount}")
    public ResponseEntity<?> addPointsToPlayer(@PathVariable("username") String username, @PathVariable("amount") Integer amount) {
        playerRepository.updatePointsByUsername(username, amount);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
