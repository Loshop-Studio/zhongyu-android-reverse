package com.zykj.board;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzyCommand$CommandSource;
import java.io.IOException;

/* renamed from: com.zykj.board.u */
/* loaded from: classes3.dex */
public final class C4394u extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4396v c4396vNewBuilder = EzyCommand$CommandSource.CommandInfo.GraphRemove.newBuilder();
        try {
            c4396vNewBuilder.m3851h(codedInputStream, extensionRegistryLite);
            return c4396vNewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4396vNewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4396vNewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4396vNewBuilder.buildPartial());
        }
    }
}
