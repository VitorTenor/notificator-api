package com.vitortenorio.notificator.api.v1.disassembler.imp;

import com.vitortenorio.notificator.api.v1.disassembler.Disassembler;
import com.vitortenorio.notificator.api.v1.output.MessageOutput;
import org.springframework.stereotype.Component;

@Component
public class MessageDisassembler implements Disassembler<String, MessageOutput> {
    @Override
    public MessageOutput toOutput(String message) {
        return new MessageOutput(message);
    }
}
