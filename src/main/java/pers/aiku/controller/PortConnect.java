package pers.aiku.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pers.aiku.dto.ConnectPortDTO;
import pers.aiku.util.Result;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

@RestController
public class PortConnect {
	@PostMapping("/connectPort")
	public Result connectPort(@RequestBody ConnectPortDTO connectPortDTO) {
		try (Socket socket = new Socket()) {
			socket.connect(new InetSocketAddress(connectPortDTO.getIp(), connectPortDTO.getPort()), 15000);
			return Result.success("开放");
		} catch (IOException e) {
			return Result.error("关闭");
		}
	}
}
