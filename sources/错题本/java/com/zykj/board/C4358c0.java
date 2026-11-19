package com.zykj.board;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzyPageSnapshot$PageSnapshot;
import java.io.IOException;

/* renamed from: com.zykj.board.c0 */
/* loaded from: classes3.dex */
public final class C4358c0 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4361d0 c4361d0NewBuilder = EzyPageSnapshot$PageSnapshot.GraphSnapshot.newBuilder();
        try {
            c4361d0NewBuilder.m3718m(codedInputStream, extensionRegistryLite);
            return c4361d0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4361d0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4361d0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4361d0NewBuilder.buildPartial());
        }
    }
}
