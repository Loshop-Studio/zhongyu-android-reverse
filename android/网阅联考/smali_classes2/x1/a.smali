.class public abstract synthetic Lx1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[I


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/message/server/bean/Status;->values()[Lcom/zykj/message/server/bean/Status;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lx1/a;->a:[I

    sget-object v1, Lcom/zykj/message/server/bean/Status;->b:Lcom/zykj/message/server/bean/Status;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/message/server/bean/Status;->c:Lcom/zykj/message/server/bean/Status;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    sget-object v1, Lcom/zykj/message/server/bean/Status;->d:Lcom/zykj/message/server/bean/Status;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1

    return-void
.end method
