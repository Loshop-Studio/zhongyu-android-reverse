package com.zykj.board;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.io.IOException;

/* renamed from: com.zykj.board.y0 */
/* loaded from: classes3.dex */
public final class C4403y0 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4405z0 c4405z0NewBuilder = EzyTouchEvent$TouchEvent.PointerCoords.newBuilder();
        try {
            c4405z0NewBuilder.m3882h(codedInputStream, extensionRegistryLite);
            return c4405z0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4405z0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4405z0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4405z0NewBuilder.buildPartial());
        }
    }
}
