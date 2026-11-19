package com.zykj.board;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzySource$TouchSource;
import java.io.IOException;

/* renamed from: com.zykj.board.v0 */
/* loaded from: classes3.dex */
public final class C4397v0 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4399w0 c4399w0NewBuilder = EzySource$TouchSource.TouchInfo.newBuilder();
        try {
            c4399w0NewBuilder.m3858j(codedInputStream, extensionRegistryLite);
            return c4399w0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4399w0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4399w0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4399w0NewBuilder.buildPartial());
        }
    }
}
