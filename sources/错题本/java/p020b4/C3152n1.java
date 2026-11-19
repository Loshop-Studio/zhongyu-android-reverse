package p020b4;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.C4377l0;
import com.zykj.board.EzySource$GeometrySource;
import java.io.IOException;

/* renamed from: b4.n1 */
/* loaded from: classes3.dex */
public final class C3152n1 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4377l0 c4377l0NewBuilder = EzySource$GeometrySource.newBuilder();
        try {
            c4377l0NewBuilder.m3780h(codedInputStream, extensionRegistryLite);
            return c4377l0NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4377l0NewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4377l0NewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4377l0NewBuilder.buildPartial());
        }
    }
}
