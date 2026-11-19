package p020b4;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.C4401x0;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.io.IOException;

/* renamed from: b4.x1 */
/* loaded from: classes3.dex */
public final class C3182x1 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4401x0 c4401x0NewBuilder = EzyTouchEvent$TouchEvent.newBuilder();
        try {
            c4401x0NewBuilder.m3869h(codedInputStream, extensionRegistryLite);
            return c4401x0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4401x0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4401x0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4401x0NewBuilder.buildPartial());
        }
    }
}
