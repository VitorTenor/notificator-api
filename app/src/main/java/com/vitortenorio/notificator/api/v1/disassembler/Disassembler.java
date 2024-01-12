package com.vitortenorio.notificator.api.v1.disassembler;

public interface Disassembler <E, O> {
    O toOutput(E entity);
}
