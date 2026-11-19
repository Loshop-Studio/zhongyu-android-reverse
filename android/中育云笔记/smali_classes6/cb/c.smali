.class public abstract synthetic Lcb/c;
.super Ljava/lang/Object;


# static fields
.field public static final synthetic a:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/message/server/bean/Status;->values()[Lcom/zykj/message/server/bean/Status;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    new-array v0, v0, [I

    .line 7
    .line 8
    sput-object v0, Lcb/c;->a:[I

    .line 9
    .line 10
    sget-object v1, Lcom/zykj/message/server/bean/Status;->d:Lcom/zykj/message/server/bean/Status;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    aput v2, v0, v1

    .line 18
    .line 19
    sget-object v1, Lcom/zykj/message/server/bean/Status;->e:Lcom/zykj/message/server/bean/Status;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x2

    .line 26
    aput v2, v0, v1

    .line 27
    .line 28
    sget-object v1, Lcom/zykj/message/server/bean/Status;->f:Lcom/zykj/message/server/bean/Status;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x3

    .line 35
    aput v2, v0, v1

    .line 36
    .line 37
    return-void
.end method
