package com.zykj.board;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzyPageRouter$PageRouter;
import java.io.IOException;

/* renamed from: com.zykj.board.z */
/* loaded from: classes3.dex */
public final class C4404z extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4352a0 c4352a0NewBuilder = EzyPageRouter$PageRouter.PageInfo.newBuilder();
        try {
            c4352a0NewBuilder.m3691h(codedInputStream, extensionRegistryLite);
            return c4352a0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4352a0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4352a0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4352a0NewBuilder.buildPartial());
        }
    }
}
