package com.zykj.board;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzyCommand$CommandSource;
import java.io.IOException;

/* renamed from: com.zykj.board.s */
/* loaded from: classes3.dex */
public final class C4390s extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4392t c4392tNewBuilder = EzyCommand$CommandSource.CommandInfo.GraphMatrix.newBuilder();
        try {
            c4392tNewBuilder.m3834k(codedInputStream, extensionRegistryLite);
            return c4392tNewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4392tNewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4392tNewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4392tNewBuilder.buildPartial());
        }
    }
}
