package p020b4;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.zykj.board.C4402y;
import com.zykj.board.EzyPageRouter$PageRouter;
import java.io.IOException;

/* renamed from: b4.h0 */
/* loaded from: classes3.dex */
public final class C3133h0 extends AbstractParser {
    @Override // com.google.protobuf.Parser
    public final Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        C4402y c4402yNewBuilder = EzyPageRouter$PageRouter.newBuilder();
        try {
            c4402yNewBuilder.m3877h(codedInputStream, extensionRegistryLite);
            return c4402yNewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4402yNewBuilder.buildPartial());
        } catch (UninitializedMessageException e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(c4402yNewBuilder.buildPartial());
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8).setUnfinishedMessage(c4402yNewBuilder.buildPartial());
        }
    }
}
