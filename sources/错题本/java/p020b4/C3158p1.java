package p020b4;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.C4383o0;
import com.zykj.board.EzySource$MatrixSource;
import java.io.IOException;

/* renamed from: b4.p1 */
/* loaded from: classes3.dex */
public final class C3158p1 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4383o0 c4383o0NewBuilder = EzySource$MatrixSource.newBuilder();
        try {
            c4383o0NewBuilder.m3804h(codedInputStream, extensionRegistryLite);
            return c4383o0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4383o0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4383o0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4383o0NewBuilder.buildPartial());
        }
    }
}
