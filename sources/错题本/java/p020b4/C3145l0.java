package p020b4;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.C4355b0;
import com.zykj.board.EzyPageSnapshot$PageSnapshot;
import java.io.IOException;

/* renamed from: b4.l0 */
/* loaded from: classes3.dex */
public final class C3145l0 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4355b0 c4355b0NewBuilder = EzyPageSnapshot$PageSnapshot.newBuilder();
        try {
            c4355b0NewBuilder.m3697i(codedInputStream, extensionRegistryLite);
            return c4355b0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4355b0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4355b0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4355b0NewBuilder.buildPartial());
        }
    }
}
