package com.zykj.board;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.io.IOException;

/* renamed from: com.zykj.board.a1 */
/* loaded from: classes3.dex */
public final class C4353a1 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4356b1 c4356b1NewBuilder = EzyTouchEvent$TouchEvent.PointerProperties.newBuilder();
        try {
            c4356b1NewBuilder.m3702f(codedInputStream, extensionRegistryLite);
            return c4356b1NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4356b1NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4356b1NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4356b1NewBuilder.buildPartial());
        }
    }
}
