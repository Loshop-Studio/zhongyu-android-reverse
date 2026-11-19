package com.zykj.board;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzySource$MatrixSource;
import java.io.IOException;

/* renamed from: com.zykj.board.p0 */
/* loaded from: classes3.dex */
public final class C4385p0 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4387q0 c4387q0NewBuilder = EzySource$MatrixSource.MatrixInfo.newBuilder();
        try {
            c4387q0NewBuilder.m3821h(codedInputStream, extensionRegistryLite);
            return c4387q0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4387q0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4387q0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4387q0NewBuilder.buildPartial());
        }
    }
}
