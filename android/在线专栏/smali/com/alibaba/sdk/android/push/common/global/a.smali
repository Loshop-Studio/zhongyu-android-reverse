.class public final enum Lcom/alibaba/sdk/android/push/common/global/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/alibaba/sdk/android/push/common/global/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/alibaba/sdk/android/push/common/global/a;

.field public static final enum b:Lcom/alibaba/sdk/android/push/common/global/a;

.field public static final enum c:Lcom/alibaba/sdk/android/push/common/global/a;

.field public static final enum d:Lcom/alibaba/sdk/android/push/common/global/a;

.field public static final enum e:Lcom/alibaba/sdk/android/push/common/global/a;

.field public static final enum f:Lcom/alibaba/sdk/android/push/common/global/a;

.field public static final enum g:Lcom/alibaba/sdk/android/push/common/global/a;

.field public static final enum h:Lcom/alibaba/sdk/android/push/common/global/a;

.field public static final enum i:Lcom/alibaba/sdk/android/push/common/global/a;

.field private static final synthetic m:[Lcom/alibaba/sdk/android/push/common/global/a;


# instance fields
.field private final j:Ljava/lang/String;

.field private final k:Ljava/lang/String;

.field private final l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 20

    new-instance v6, Lcom/alibaba/sdk/android/push/common/global/a;

    const-string v1, "CHANNEL_SERVICE"

    const/4 v2, 0x0

    const-string v3, "com.taobao.accs.ChannelService"

    const-string v4, "service"

    const/4 v5, 0x1

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/alibaba/sdk/android/push/common/global/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    sput-object v6, Lcom/alibaba/sdk/android/push/common/global/a;->a:Lcom/alibaba/sdk/android/push/common/global/a;

    new-instance v0, Lcom/alibaba/sdk/android/push/common/global/a;

    const-string v8, "KERNEL_SERVICE"

    const/4 v9, 0x1

    const-string v10, "com.taobao.accs.ChannelService$KernelService"

    const-string v11, "service"

    const/4 v12, 0x1

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/alibaba/sdk/android/push/common/global/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    sput-object v0, Lcom/alibaba/sdk/android/push/common/global/a;->b:Lcom/alibaba/sdk/android/push/common/global/a;

    new-instance v1, Lcom/alibaba/sdk/android/push/common/global/a;

    const-string v14, "ACCS_JOB_SERVICE"

    const/4 v15, 0x2

    const-string v16, "com.taobao.accs.internal.AccsJobService"

    const-string v17, "service"

    const/16 v18, 0x1

    move-object v13, v1

    invoke-direct/range {v13 .. v18}, Lcom/alibaba/sdk/android/push/common/global/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    sput-object v1, Lcom/alibaba/sdk/android/push/common/global/a;->c:Lcom/alibaba/sdk/android/push/common/global/a;

    new-instance v2, Lcom/alibaba/sdk/android/push/common/global/a;

    const-string v8, "MSG_DISTRIBUTE_SERVICE"

    const/4 v9, 0x3

    const-string v10, "com.taobao.accs.data.MsgDistributeService"

    const-string v11, "service"

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Lcom/alibaba/sdk/android/push/common/global/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    sput-object v2, Lcom/alibaba/sdk/android/push/common/global/a;->d:Lcom/alibaba/sdk/android/push/common/global/a;

    new-instance v3, Lcom/alibaba/sdk/android/push/common/global/a;

    const-string v14, "EVENT_RECEIVER"

    const/4 v15, 0x4

    const-string v16, "com.taobao.accs.EventReceiver"

    const-string v17, "receiver"

    const/16 v18, 0x0

    move-object v13, v3

    invoke-direct/range {v13 .. v18}, Lcom/alibaba/sdk/android/push/common/global/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    sput-object v3, Lcom/alibaba/sdk/android/push/common/global/a;->e:Lcom/alibaba/sdk/android/push/common/global/a;

    new-instance v4, Lcom/alibaba/sdk/android/push/common/global/a;

    const-string v8, "SERVICE_RECEIVER"

    const/4 v9, 0x5

    const-string v10, "com.taobao.accs.ServiceReceiver"

    const-string v11, "receiver"

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, Lcom/alibaba/sdk/android/push/common/global/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    sput-object v4, Lcom/alibaba/sdk/android/push/common/global/a;->f:Lcom/alibaba/sdk/android/push/common/global/a;

    new-instance v5, Lcom/alibaba/sdk/android/push/common/global/a;

    const-string v14, "AGOO_SERVICE"

    const/4 v15, 0x6

    const-string v16, "org.android.agoo.accs.AgooService"

    const-string v17, "service"

    const/16 v18, 0x1

    move-object v13, v5

    invoke-direct/range {v13 .. v18}, Lcom/alibaba/sdk/android/push/common/global/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    sput-object v5, Lcom/alibaba/sdk/android/push/common/global/a;->g:Lcom/alibaba/sdk/android/push/common/global/a;

    new-instance v13, Lcom/alibaba/sdk/android/push/common/global/a;

    const-string v8, "ALIYUN_PUSH_INTENT_SERVICE"

    const/4 v9, 0x7

    const-string v10, "com.aliyun.ams.emas.push.AgooInnerService"

    const-string v11, "service"

    move-object v7, v13

    invoke-direct/range {v7 .. v12}, Lcom/alibaba/sdk/android/push/common/global/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    sput-object v13, Lcom/alibaba/sdk/android/push/common/global/a;->h:Lcom/alibaba/sdk/android/push/common/global/a;

    new-instance v7, Lcom/alibaba/sdk/android/push/common/global/a;

    const-string v15, "MSG_SERVICE"

    const/16 v16, 0x8

    const-string v17, "com.aliyun.ams.emas.push.MsgService"

    const-string v18, "service"

    const/16 v19, 0x1

    move-object v14, v7

    invoke-direct/range {v14 .. v19}, Lcom/alibaba/sdk/android/push/common/global/a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    sput-object v7, Lcom/alibaba/sdk/android/push/common/global/a;->i:Lcom/alibaba/sdk/android/push/common/global/a;

    const/16 v8, 0x9

    new-array v8, v8, [Lcom/alibaba/sdk/android/push/common/global/a;

    const/4 v9, 0x0

    aput-object v6, v8, v9

    const/4 v6, 0x1

    aput-object v0, v8, v6

    const/4 v0, 0x2

    aput-object v1, v8, v0

    const/4 v0, 0x3

    aput-object v2, v8, v0

    const/4 v0, 0x4

    aput-object v3, v8, v0

    const/4 v0, 0x5

    aput-object v4, v8, v0

    const/4 v0, 0x6

    aput-object v5, v8, v0

    const/4 v0, 0x7

    aput-object v13, v8, v0

    const/16 v0, 0x8

    aput-object v7, v8, v0

    sput-object v8, Lcom/alibaba/sdk/android/push/common/global/a;->m:[Lcom/alibaba/sdk/android/push/common/global/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/alibaba/sdk/android/push/common/global/a;->j:Ljava/lang/String;

    iput-object p4, p0, Lcom/alibaba/sdk/android/push/common/global/a;->k:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/alibaba/sdk/android/push/common/global/a;->l:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/alibaba/sdk/android/push/common/global/a;
    .locals 1

    const-class v0, Lcom/alibaba/sdk/android/push/common/global/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/alibaba/sdk/android/push/common/global/a;

    return-object p0
.end method

.method public static values()[Lcom/alibaba/sdk/android/push/common/global/a;
    .locals 1

    sget-object v0, Lcom/alibaba/sdk/android/push/common/global/a;->m:[Lcom/alibaba/sdk/android/push/common/global/a;

    invoke-virtual {v0}, [Lcom/alibaba/sdk/android/push/common/global/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/alibaba/sdk/android/push/common/global/a;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/alibaba/sdk/android/push/common/global/a;->j:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/alibaba/sdk/android/push/common/global/a;->k:Ljava/lang/String;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/alibaba/sdk/android/push/common/global/a;->l:Z

    return v0
.end method
