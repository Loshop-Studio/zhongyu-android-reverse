.class public Lcom/tencent/liteav/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/b$a;
    }
.end annotation


# static fields
.field private static a:Ljava/lang/String; = "TXCDataReport"

.field private static u:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/liteav/b$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private b:Ljava/util/HashMap;

.field private c:Ljava/lang/String;

.field private d:Landroid/content/Context;

.field private e:Ljava/lang/String;

.field private f:J

.field private g:J

.field private h:J

.field private i:J

.field private j:Z

.field private k:J

.field private l:I

.field private m:Z

.field private n:J

.field private o:J

.field private p:J

.field private q:J

.field private r:J

.field private s:I

.field private t:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tencent/liteav/b;->u:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/tencent/liteav/b;->h:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/tencent/liteav/b;->m:Z

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    iput-wide v1, p0, Lcom/tencent/liteav/b;->n:J

    .line 14
    .line 15
    iput-wide v1, p0, Lcom/tencent/liteav/b;->o:J

    .line 16
    .line 17
    iput-wide v1, p0, Lcom/tencent/liteav/b;->p:J

    .line 18
    .line 19
    iput-wide v1, p0, Lcom/tencent/liteav/b;->q:J

    .line 20
    .line 21
    iput-wide v1, p0, Lcom/tencent/liteav/b;->r:J

    .line 22
    .line 23
    iput v0, p0, Lcom/tencent/liteav/b;->s:I

    .line 24
    .line 25
    const-string v0, ""

    .line 26
    .line 27
    iput-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    .line 28
    .line 29
    iput-object v0, p0, Lcom/tencent/liteav/b;->w:Ljava/lang/String;

    .line 30
    .line 31
    new-instance v0, Ljava/util/HashMap;

    .line 32
    .line 33
    const/16 v3, 0x64

    .line 34
    .line 35
    invoke-direct {v0, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lcom/tencent/liteav/b;->d:Landroid/content/Context;

    .line 45
    .line 46
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCCommonUtil;->getAppVersion()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lcom/tencent/liteav/b;->e:Ljava/lang/String;

    .line 51
    .line 52
    const/16 p1, 0x1388

    .line 53
    .line 54
    iput p1, p0, Lcom/tencent/liteav/b;->l:I

    .line 55
    .line 56
    iput-wide v1, p0, Lcom/tencent/liteav/b;->r:J

    .line 57
    .line 58
    return-void
.end method

.method private a(I)V
    .locals 38

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 18
    new-instance v2, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;

    invoke-direct {v2}, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;-><init>()V

    .line 19
    iget-object v3, v0, Lcom/tencent/liteav/b;->c:Ljava/lang/String;

    iput-object v3, v2, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;->url:Ljava/lang/String;

    const/4 v3, 0x0

    .line 20
    iput-boolean v3, v2, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;->report_common:Z

    .line 21
    iput-boolean v3, v2, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;->report_status:Z

    .line 22
    iget-object v3, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v4, "token"

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 23
    iget-object v4, v0, Lcom/tencent/liteav/b;->d:Landroid/content/Context;

    sget v5, Lcom/tencent/liteav/basic/datareport/a;->am:I

    invoke-static {v4, v3, v1, v5, v2}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->InitEvent(Landroid/content/Context;Ljava/lang/String;IILcom/tencent/liteav/basic/datareport/TXCDRExtInfo;)V

    .line 24
    invoke-direct {v0, v1, v3}, Lcom/tencent/liteav/b;->a(ILjava/lang/String;)V

    .line 25
    iget-object v2, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v4, "u64_timestamp"

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static {v3, v1, v4, v5, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 26
    iget-object v2, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v5, 0x1bc3

    invoke-static {v2, v5}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v5

    .line 27
    iget-object v2, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v7, 0x1bc4

    invoke-static {v2, v7}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v7

    const-wide/16 v9, -0x1

    cmp-long v2, v7, v9

    if-eqz v2, :cond_0

    sub-long/2addr v7, v5

    :cond_0
    const-wide/16 v11, 0x0

    cmp-long v2, v7, v11

    if-gez v2, :cond_1

    move-wide v13, v9

    goto :goto_0

    :cond_1
    move-wide v13, v7

    .line 28
    :goto_0
    const-string v2, "u32_dns_time"

    invoke-static {v3, v1, v2, v13, v14}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 29
    iget-object v13, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v14, 0x1bc5

    invoke-static {v13, v14}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v13

    cmp-long v15, v13, v9

    if-eqz v15, :cond_2

    sub-long/2addr v13, v5

    :cond_2
    cmp-long v15, v13, v11

    if-gez v15, :cond_3

    :goto_1
    move-wide/from16 v17, v11

    goto :goto_2

    :cond_3
    move-wide v9, v13

    goto :goto_1

    .line 30
    :goto_2
    const-string v11, "u32_connect_server_time"

    invoke-static {v3, v1, v11, v9, v10}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 31
    iget-object v9, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v10, 0x138c

    invoke-static {v9, v10}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v9

    move-wide/from16 v19, v5

    int-to-long v5, v9

    .line 32
    const-string v10, "u32_video_decode_type"

    invoke-static {v3, v1, v10, v5, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 33
    iget-object v5, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v6, 0x1771

    invoke-static {v5, v6}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v5

    sub-long v5, v5, v19

    iput-wide v5, v0, Lcom/tencent/liteav/b;->f:J

    cmp-long v12, v5, v17

    if-gez v12, :cond_4

    const-wide/16 v5, -0x1

    .line 34
    :cond_4
    const-string v12, "u32_first_i_frame"

    invoke-static {v3, v1, v12, v5, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 35
    iget-object v5, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v6, 0x1bbf

    invoke-static {v5, v6}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v5

    sub-long v5, v5, v19

    cmp-long v21, v5, v17

    if-gez v21, :cond_5

    move-wide/from16 v21, v5

    const-wide/16 v5, -0x1

    goto :goto_3

    :cond_5
    move-wide/from16 v21, v5

    .line 36
    :goto_3
    const-string v15, "u32_first_frame_down"

    invoke-static {v3, v1, v15, v5, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 37
    iget-object v5, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v6, 0x138d

    invoke-static {v5, v6}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v5

    sub-long v5, v5, v19

    cmp-long v16, v5, v17

    move-wide/from16 v25, v5

    if-gez v16, :cond_6

    const-wide/16 v5, -0x1

    :cond_6
    move-object/from16 v16, v12

    .line 38
    const-string v12, "u32_first_video_decode_time"

    invoke-static {v3, v1, v12, v5, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 39
    iget-object v5, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v6, 0x1bc0

    invoke-static {v5, v6}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v5

    sub-long v5, v5, v19

    cmp-long v27, v5, v17

    if-gez v27, :cond_7

    move-wide/from16 v27, v5

    const-wide/16 v5, -0x1

    :goto_4
    move-object/from16 v29, v12

    goto :goto_5

    :cond_7
    move-wide/from16 v27, v5

    goto :goto_4

    .line 40
    :goto_5
    const-string v12, "u32_first_audio_frame_down"

    invoke-static {v3, v1, v12, v5, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 41
    iget-object v5, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v6, 0x7f1

    invoke-static {v5, v6}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v5

    sub-long v5, v5, v19

    cmp-long v17, v5, v17

    if-gez v17, :cond_8

    move-wide/from16 v17, v5

    const-wide/16 v5, -0x1

    :goto_6
    move-object/from16 v19, v12

    goto :goto_7

    :cond_8
    move-wide/from16 v17, v5

    goto :goto_6

    .line 42
    :goto_7
    const-string v12, "u32_first_audio_render_time"

    invoke-static {v3, v1, v12, v5, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 43
    iget-object v5, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v6, 0x1bc1

    invoke-static {v5, v6}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v5

    move v6, v9

    move-object/from16 v20, v10

    int-to-long v9, v5

    move/from16 v23, v6

    .line 44
    const-string v6, "u64_err_code"

    invoke-static {v3, v1, v6, v9, v10}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 45
    iget-object v9, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v10, 0x1bc2

    invoke-static {v9, v10}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v9

    move v10, v5

    move-object/from16 v24, v6

    int-to-long v5, v9

    move/from16 v30, v10

    .line 46
    const-string v10, "str_err_info"

    invoke-static {v3, v1, v10, v5, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 47
    iget-object v5, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v6, 0x1bc8

    invoke-static {v5, v6}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v5

    .line 48
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    move/from16 v31, v5

    const-string v5, "u32_link_type"

    invoke-static {v3, v1, v5, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 49
    iget-object v6, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    move-object/from16 v32, v5

    const/16 v5, 0x1bc7

    invoke-static {v6, v5}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v5

    .line 50
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    move/from16 v33, v5

    const-string v5, "u32_channel_type"

    invoke-static {v3, v1, v5, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 51
    iget-object v6, v0, Lcom/tencent/liteav/b;->e:Ljava/lang/String;

    move-object/from16 v34, v5

    const-string v5, "str_app_version"

    invoke-static {v3, v1, v5, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 52
    invoke-static {v3, v1}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->nativeReportEvent(Ljava/lang/String;I)V

    .line 53
    sget-object v6, Lcom/tencent/liteav/b;->a:Ljava/lang/String;

    move-object/from16 v35, v6

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v36, v5

    const-string v5, "report evt "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ": token="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "str_user_id"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v37, v9

    iget-object v9, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    .line 54
    invoke-virtual {v9, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "dev_uuid"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    .line 55
    invoke-virtual {v9, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "str_session_id"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    .line 56
    invoke-virtual {v9, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "str_device_type"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v9, "str_device_type"

    .line 57
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "str_os_info"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v9, "str_os_info"

    .line 58
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "str_package_name"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v9, "str_package_name"

    .line 59
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "u32_network_type"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v9, "u32_network_type"

    .line 60
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "u32_server_ip"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v9, "u32_server_ip"

    .line 61
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "str_stream_url"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v9, "str_stream_url"

    .line 62
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    .line 63
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v20

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v2, v23

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v2, v21

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v29

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v2, v25

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v16

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v0, Lcom/tencent/liteav/b;->f:J

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v19

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v2, v27

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v2, v17

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v24

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v2, v30

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v2, v37

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v32

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v2, v31

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v34

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v2, v33

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v36

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v0, Lcom/tencent/liteav/b;->e:Ljava/lang/String;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v35

    .line 64
    invoke-static {v2, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(ILjava/lang/String;)V
    .locals 6

    .line 65
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v1, 0x1bd1

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/module/TXCStatus;->b(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    .line 66
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v0, p2

    .line 67
    :cond_0
    iget-object v1, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v2, "str_session_id"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v3, 0x1bc6

    invoke-static {v1, v3}, Lcom/tencent/liteav/basic/module/TXCStatus;->b(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "u32_server_ip"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    iget-boolean v0, p0, Lcom/tencent/liteav/b;->m:Z

    const-string v1, "str_stream_url"

    if-eqz v0, :cond_1

    .line 70
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    iget-object v4, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v5, 0x1bcc

    invoke-static {v4, v5}, Lcom/tencent/liteav/basic/module/TXCStatus;->b(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/tencent/liteav/b;->f(Ljava/lang/String;)V

    goto :goto_0

    .line 72
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    iget-object v4, p0, Lcom/tencent/liteav/b;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v4, "str_user_id"

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p2, p1, v4, v0}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v4, "dev_uuid"

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p2, p1, v4, v0}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p2, p1, v2, v0}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 76
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v2, "str_device_type"

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p2, p1, v2, v0}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 77
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v2, "str_os_info"

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p2, p1, v2, v0}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 78
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v2, "str_package_name"

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p2, p1, v2, v0}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 79
    const-string v0, "u32_network_type"

    invoke-direct {p0, v0}, Lcom/tencent/liteav/b;->g(Ljava/lang/String;)I

    move-result v2

    int-to-long v4, v2

    invoke-static {p2, p1, v0, v4, v5}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 80
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p2, p1, v3, v0}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p2, p1, v1, v0}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private b(I)V
    .locals 61

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 18
    new-instance v2, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;

    invoke-direct {v2}, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;-><init>()V

    .line 19
    iget-object v3, v0, Lcom/tencent/liteav/b;->c:Ljava/lang/String;

    iput-object v3, v2, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;->url:Ljava/lang/String;

    const/4 v3, 0x0

    .line 20
    iput-boolean v3, v2, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;->report_common:Z

    .line 21
    iput-boolean v3, v2, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;->report_status:Z

    .line 22
    iget-object v3, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v4, "token"

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 23
    iget-object v4, v0, Lcom/tencent/liteav/b;->d:Landroid/content/Context;

    sget v5, Lcom/tencent/liteav/basic/datareport/a;->am:I

    invoke-static {v4, v3, v1, v5, v2}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->InitEvent(Landroid/content/Context;Ljava/lang/String;IILcom/tencent/liteav/basic/datareport/TXCDRExtInfo;)V

    .line 24
    invoke-direct {v0, v1, v3}, Lcom/tencent/liteav/b;->a(ILjava/lang/String;)V

    .line 25
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getUtcTimeTick()J

    move-result-wide v4

    .line 26
    const-string v2, "u64_end_timestamp"

    invoke-static {v3, v1, v2, v4, v5}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 27
    const-string v2, "u64_timestamp"

    invoke-static {v3, v1, v2, v4, v5}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 28
    iget-object v4, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v5, 0x232a

    invoke-static {v4, v5}, Lcom/tencent/liteav/basic/module/TXCStatus;->d(Ljava/lang/String;I)D

    move-result-wide v4

    .line 29
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v6

    const-string v7, "u32_avg_cpu_usage"

    invoke-static {v3, v1, v7, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 30
    iget-object v6, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v8, 0x232d

    invoke-static {v6, v8}, Lcom/tencent/liteav/basic/module/TXCStatus;->d(Ljava/lang/String;I)D

    move-result-wide v8

    .line 31
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v6

    const-string v10, "u32_avg_memory"

    invoke-static {v3, v1, v10, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 32
    iget-wide v11, v0, Lcom/tencent/liteav/b;->r:J

    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    .line 33
    const-string v11, "u64_begin_timestamp"

    invoke-static {v3, v1, v11, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 34
    iget-object v12, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v13, 0x1bc3

    invoke-static {v12, v13}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v12

    .line 35
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v14

    sub-long/2addr v14, v12

    const-wide/16 v12, 0x3e8

    div-long/2addr v14, v12

    const-wide/16 v12, 0x0

    cmp-long v16, v14, v12

    const-wide/16 v17, -0x1

    move-wide/from16 v19, v12

    if-gez v16, :cond_0

    move-wide/from16 v12, v17

    :goto_0
    move-object/from16 v21, v6

    goto :goto_1

    :cond_0
    move-wide v12, v14

    goto :goto_0

    .line 36
    :goto_1
    const-string v6, "u64_playtime"

    invoke-static {v3, v1, v6, v12, v13}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    if-gez v16, :cond_1

    move-wide/from16 v12, v17

    goto :goto_2

    :cond_1
    move-wide v12, v14

    .line 37
    :goto_2
    const-string v6, "u32_result"

    invoke-static {v3, v1, v6, v12, v13}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 38
    iget-object v12, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v13, 0x1bc1

    invoke-static {v12, v13}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v12

    move-wide/from16 v16, v14

    int-to-long v13, v12

    .line 39
    const-string v15, "u64_err_code"

    invoke-static {v3, v1, v15, v13, v14}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 40
    iget-object v13, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v14, 0x7d4

    invoke-static {v13, v14}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v13

    move-object v14, v11

    move/from16 v18, v12

    int-to-long v11, v13

    move-object/from16 v22, v14

    .line 41
    const-string v14, "u32_speed_cnt"

    invoke-static {v3, v1, v14, v11, v12}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 42
    iget-object v11, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v12, 0x7d8

    invoke-static {v11, v12}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v11

    move/from16 v23, v13

    int-to-long v12, v11

    move-object/from16 v24, v15

    .line 43
    const-string v15, "u64_audio_cache_avg"

    invoke-static {v3, v1, v15, v12, v13}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 44
    const-string v15, "u32_avg_cache_time"

    invoke-static {v3, v1, v15, v12, v13}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 45
    iget-object v12, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v13, 0x7d3

    invoke-static {v12, v13}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v12

    int-to-long v12, v12

    move-object/from16 v25, v6

    .line 46
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    move-wide/from16 v26, v12

    const-string v12, "u32_max_load"

    invoke-static {v3, v1, v12, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 47
    iget-object v6, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v13, 0x7d1

    invoke-static {v6, v13}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v6

    move-object/from16 v28, v12

    int-to-long v12, v6

    .line 48
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    move-wide/from16 v29, v12

    const-string v12, "u32_avg_load"

    invoke-static {v3, v1, v12, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 49
    iget-object v6, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v13, 0x7d2

    invoke-static {v6, v13}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v6

    move-object/from16 v31, v12

    int-to-long v12, v6

    .line 50
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    move-wide/from16 v32, v12

    const-string v12, "u32_load_cnt"

    invoke-static {v3, v1, v12, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 51
    iget-object v6, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v13, 0x7d5

    invoke-static {v6, v13}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v6

    move-object/from16 v34, v12

    int-to-long v12, v6

    move/from16 v35, v11

    .line 52
    const-string v11, "u32_nodata_cnt"

    invoke-static {v3, v1, v11, v12, v13}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    mul-long v12, v29, v32

    move-object/from16 v36, v15

    .line 53
    const-string v15, "u32_audio_block_time"

    invoke-static {v3, v1, v15, v12, v13}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    move-wide/from16 v37, v12

    .line 54
    iget-wide v12, v0, Lcom/tencent/liteav/b;->f:J

    move-object/from16 v39, v15

    const-string v15, "u32_first_i_frame"

    invoke-static {v3, v1, v15, v12, v13}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 55
    iget-object v12, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v13, 0x177f

    invoke-static {v12, v13}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v12

    move-object/from16 v40, v14

    int-to-long v13, v12

    move/from16 v41, v6

    .line 56
    const-string v6, "u32_video_width"

    invoke-static {v3, v1, v6, v13, v14}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 57
    iget-object v13, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v14, 0x1780

    invoke-static {v13, v14}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v13

    move-object v14, v11

    move/from16 v42, v12

    int-to-long v11, v13

    move-object/from16 v43, v14

    .line 58
    const-string v14, "u32_video_height"

    invoke-static {v3, v1, v14, v11, v12}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 59
    iget-object v11, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v12, 0x1781

    invoke-static {v11, v12}, Lcom/tencent/liteav/basic/module/TXCStatus;->d(Ljava/lang/String;I)D

    move-result-wide v11

    move-wide/from16 v44, v11

    .line 60
    invoke-static/range {v44 .. v45}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v11

    const-string v12, "u32_video_avg_fps"

    invoke-static {v3, v1, v12, v11}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 61
    iget-object v11, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    move-object/from16 v46, v12

    const/16 v12, 0x1773

    invoke-static {v11, v12}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v11

    move/from16 v47, v13

    .line 62
    iget-object v13, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    move-object/from16 v48, v14

    const/16 v14, 0x1775

    invoke-static {v13, v14}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v13

    move-object/from16 v49, v6

    .line 63
    iget-object v6, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    move-object/from16 v50, v15

    const/16 v15, 0x1776

    move-wide/from16 v51, v8

    invoke-static {v6, v15}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v8

    cmp-long v6, v11, v19

    if-lez v6, :cond_2

    .line 64
    div-long v19, v8, v11

    :cond_2
    move-wide/from16 v53, v4

    move-wide/from16 v4, v19

    .line 65
    const-string v6, "u64_block_duration_avg"

    invoke-static {v3, v1, v6, v4, v5}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 66
    const-string v6, "u32_avg_block_time"

    invoke-static {v3, v1, v6, v4, v5}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 67
    const-string v6, "u64_block_count"

    invoke-static {v3, v1, v6, v11, v12}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 68
    const-string v6, "u32_video_block_time"

    invoke-static {v3, v1, v6, v8, v9}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 69
    const-string v6, "u64_block_duration_max"

    invoke-static {v3, v1, v6, v13, v14}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 70
    iget-object v6, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v13, 0x1779

    invoke-static {v6, v13}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v13

    .line 71
    const-string v6, "u64_jitter_cache_max"

    invoke-static {v3, v1, v6, v13, v14}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 72
    iget-object v6, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v15, 0x1778

    move-wide/from16 v19, v13

    invoke-static {v6, v15}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v13

    .line 73
    const-string v6, "u64_jitter_cache_avg"

    invoke-static {v3, v1, v6, v13, v14}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 74
    iget-object v6, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v15, 0x1bc8

    invoke-static {v6, v15}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v6

    .line 75
    const-string v15, "u32_link_type"

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v1, v15, v6}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 76
    iget-object v6, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v15, 0x1bc7

    invoke-static {v6, v15}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v6

    .line 77
    const-string v15, "u32_channel_type"

    move-wide/from16 v55, v13

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v3, v1, v15, v13}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 78
    iget-object v13, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v14, 0x1bc9

    invoke-static {v13, v14}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v13

    .line 79
    const-string v14, "u32_ip_count_quic"

    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v15

    invoke-static {v3, v1, v14, v15}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 80
    iget-object v14, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v15, 0x1bca

    invoke-static {v14, v15}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v14

    .line 81
    const-string v15, "u32_connect_count_quic"

    move-wide/from16 v57, v11

    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v3, v1, v15, v11}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 82
    iget-object v11, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v12, 0x1bcb

    invoke-static {v11, v12}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v11

    .line 83
    const-string v12, "u32_connect_count_tcp"

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v15

    invoke-static {v3, v1, v12, v15}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 84
    const-string v12, "str_app_version"

    iget-object v15, v0, Lcom/tencent/liteav/b;->e:Ljava/lang/String;

    invoke-static {v3, v1, v12, v15}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 85
    iget-object v12, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v15, 0x7d9

    move/from16 v59, v11

    invoke-static {v12, v15}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v11

    const-string v15, "u32_is_real_time"

    invoke-static {v3, v1, v15, v11, v12}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 86
    invoke-static {v3, v1}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->nativeReportEvent(Ljava/lang/String;I)V

    .line 87
    sget-object v11, Lcom/tencent/liteav/b;->a:Ljava/lang/String;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "report evt "

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ": token="

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "str_user_id"

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "="

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v15, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    move-object/from16 v60, v11

    const-string v11, "str_user_id"

    .line 88
    invoke-virtual {v15, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "dev_uuid"

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v15, "dev_uuid"

    .line 89
    invoke-virtual {v11, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "str_session_id"

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v15, "str_session_id"

    .line 90
    invoke-virtual {v11, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "str_device_type"

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v15, "str_device_type"

    .line 91
    invoke-virtual {v11, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "str_os_info"

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v15, "str_os_info"

    .line 92
    invoke-virtual {v11, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "str_package_name"

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v15, "str_package_name"

    .line 93
    invoke-virtual {v11, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "u32_network_type"

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v15, "u32_network_type"

    .line 94
    invoke-virtual {v11, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "u32_server_ip"

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v15, "u32_server_ip"

    .line 95
    invoke-virtual {v11, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "str_stream_url"

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v15, "str_stream_url"

    .line 96
    invoke-virtual {v11, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    .line 97
    invoke-virtual {v11, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v2, v14

    move-wide/from16 v14, v53

    invoke-virtual {v12, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v10, v51

    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v7, v50

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v10, v0, Lcom/tencent/liteav/b;->f:J

    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v7, v49

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v7, v42

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v7, v48

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v7, v47

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v7, v46

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v10, v44

    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v7, v40

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v7, v23

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v14, v43

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v7, v41

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v7, v36

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v7, v35

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "u32_avg_block_time"

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v4, v31

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v4, v29

    invoke-virtual {v12, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v4, v28

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v4, v26

    invoke-virtual {v12, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "u32_video_block_time"

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v4, v39

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v4, v37

    invoke-virtual {v12, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v4, v34

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v4, v32

    invoke-virtual {v12, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v4, v25

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v14, v16

    invoke-virtual {v12, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v4, v24

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v4, v18

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "u32_channel_type"

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "u32_ip_count_quic"

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "u32_connect_count_quic"

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "u32_connect_count_tcp"

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v2, v59

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "u64_block_count"

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v4, v57

    invoke-virtual {v12, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "u64_jitter_cache_max"

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v4, v19

    invoke-virtual {v12, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "u64_jitter_cache_avg"

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v4, v55

    invoke-virtual {v12, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v14, v22

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v21

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "u32_is_real_time"

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v4, 0x7d9

    .line 98
    invoke-static {v2, v4}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v4

    invoke-virtual {v12, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "str_app_version"

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v0, Lcom/tencent/liteav/b;->e:Ljava/lang/String;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v60

    .line 99
    invoke-static {v2, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private c(I)V
    .locals 12

    .line 27
    new-instance v0, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;

    invoke-direct {v0}, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;-><init>()V

    .line 28
    iget-object v1, p0, Lcom/tencent/liteav/b;->c:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;->url:Ljava/lang/String;

    const/4 v1, 0x0

    .line 29
    iput-boolean v1, v0, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;->report_common:Z

    const/4 v2, 0x1

    .line 30
    iput-boolean v2, v0, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;->report_status:Z

    .line 31
    iget-object v3, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    const-string v4, "token"

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 32
    iget-object v4, p0, Lcom/tencent/liteav/b;->d:Landroid/content/Context;

    sget v5, Lcom/tencent/liteav/basic/datareport/a;->am:I

    invoke-static {v4, v3, p1, v5, v0}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->InitEvent(Landroid/content/Context;Ljava/lang/String;IILcom/tencent/liteav/basic/datareport/TXCDRExtInfo;)V

    .line 33
    invoke-direct {p0, p1, v3}, Lcom/tencent/liteav/b;->a(ILjava/lang/String;)V

    .line 34
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getUtcTimeTick()J

    move-result-wide v4

    .line 35
    const-string v0, "u64_timestamp"

    invoke-static {v3, p1, v0, v4, v5}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 36
    invoke-static {}, Lcom/tencent/liteav/basic/util/e;->a()[I

    move-result-object v0

    .line 37
    aget v4, v0, v2

    int-to-long v4, v4

    const-string v6, "u32_cpu_usage"

    invoke-static {v3, p1, v6, v4, v5}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 38
    aget v0, v0, v1

    int-to-long v0, v0

    const-string v4, "u32_app_cpu_usage"

    invoke-static {v3, p1, v4, v0, v1}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 39
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v1, 0x232a

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/module/TXCStatus;->d(Ljava/lang/String;I)D

    move-result-wide v0

    .line 40
    const-string v4, "u32_avg_cpu_usage"

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, p1, v4, v0}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v1, 0x232d

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/module/TXCStatus;->d(Ljava/lang/String;I)D

    move-result-wide v0

    .line 42
    const-string v4, "u32_avg_memory"

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, p1, v4, v0}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v1, 0x177e

    const/4 v4, 0x2

    invoke-static {v0, v1, v4}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;II)J

    move-result-wide v0

    .line 44
    const-string v5, "u32_recv_av_diff_time"

    invoke-static {v3, p1, v5, v0, v1}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 45
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v1, 0x177d

    invoke-static {v0, v1, v4}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;II)J

    move-result-wide v0

    .line 46
    const-string v5, "u32_play_av_diff_time"

    invoke-static {v3, p1, v5, v0, v1}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 47
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getUtcTimeTick()J

    move-result-wide v0

    iget-wide v5, p0, Lcom/tencent/liteav/b;->r:J

    sub-long/2addr v0, v5

    const-wide/16 v5, 0x3e8

    div-long/2addr v0, v5

    .line 48
    const-string v5, "u64_playtime"

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, p1, v5, v0}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v1, 0x7df

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_0

    move v2, v4

    .line 50
    :cond_0
    const-string v0, "u32_audio_decode_type"

    int-to-long v1, v2

    invoke-static {v3, p1, v0, v1, v2}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 51
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v1, 0x7d2

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v0

    .line 52
    iget-wide v4, p0, Lcom/tencent/liteav/b;->i:J

    const-wide/16 v6, -0x1

    cmp-long v2, v4, v6

    const-wide/16 v8, 0x0

    const-string v10, "u32_audio_block_count"

    if-nez v2, :cond_1

    .line 53
    invoke-static {v3, p1, v10, v8, v9}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    goto :goto_0

    :cond_1
    cmp-long v2, v0, v4

    if-ltz v2, :cond_2

    sub-long v4, v0, v4

    .line 54
    invoke-static {v3, p1, v10, v4, v5}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    goto :goto_0

    .line 55
    :cond_2
    invoke-static {v3, p1, v10, v6, v7}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 56
    :goto_0
    iput-wide v0, p0, Lcom/tencent/liteav/b;->i:J

    .line 57
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v1, 0x7da

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v0

    .line 58
    const-string v1, "u32_audio_cache_time"

    int-to-long v4, v0

    invoke-static {v3, p1, v1, v4, v5}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 59
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v1, 0x7de

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v0

    .line 60
    const-string v1, "u32_audio_drop"

    int-to-long v4, v0

    invoke-static {v3, p1, v1, v4, v5}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 61
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v1, 0x138c

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v0

    .line 62
    const-string v1, "u32_video_decode_type"

    int-to-long v4, v0

    invoke-static {v3, p1, v1, v4, v5}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 63
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v1, 0x1783

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v0

    int-to-long v0, v0

    .line 64
    iget-wide v4, p0, Lcom/tencent/liteav/b;->h:J

    cmp-long v2, v0, v4

    if-ltz v2, :cond_3

    sub-long v4, v0, v4

    const-wide/16 v10, 0x2

    .line 65
    div-long/2addr v4, v10

    const-string v2, "u32_video_recv_fps"

    invoke-static {v3, p1, v2, v4, v5}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 66
    :cond_3
    iput-wide v0, p0, Lcom/tencent/liteav/b;->h:J

    .line 67
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v1, 0x1772

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/module/TXCStatus;->d(Ljava/lang/String;I)D

    move-result-wide v0

    double-to-int v0, v0

    int-to-long v0, v0

    .line 68
    const-string v2, "u32_fps"

    invoke-static {v3, p1, v2, v0, v1}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 69
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v1, 0x1777

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v0

    .line 70
    const-string v1, "u32_video_cache_time"

    int-to-long v4, v0

    invoke-static {v3, p1, v1, v4, v5}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 71
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v1, 0x1778

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v0

    .line 72
    const-string v2, "u32_video_cache_count"

    invoke-static {v3, p1, v2, v0, v1}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 73
    const-string v2, "u32_avg_cache_count"

    invoke-static {v3, p1, v2, v0, v1}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 74
    iget-object v2, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v4, 0x1774

    invoke-static {v2, v4}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v4

    .line 75
    iget-wide v10, p0, Lcom/tencent/liteav/b;->g:J

    cmp-long v2, v10, v6

    const-string v6, "u32_video_block_count"

    if-nez v2, :cond_4

    .line 76
    invoke-static {v3, p1, v6, v8, v9}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    goto :goto_1

    :cond_4
    cmp-long v2, v4, v10

    if-ltz v2, :cond_5

    sub-long v7, v4, v10

    .line 77
    invoke-static {v3, p1, v6, v7, v8}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    goto :goto_1

    .line 78
    :cond_5
    invoke-static {v3, p1, v6, v8, v9}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 79
    :goto_1
    iput-wide v4, p0, Lcom/tencent/liteav/b;->g:J

    .line 80
    iget-object v2, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v4, 0x1bbe

    invoke-static {v2, v4}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v2

    .line 81
    iget-object v4, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v5, 0x1bbd

    invoke-static {v4, v5}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v4

    add-int/2addr v2, v4

    int-to-long v4, v2

    .line 82
    const-string v2, "u32_net_speed"

    invoke-static {v3, p1, v2, v4, v5}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 83
    const-string v2, "u32_avg_net_speed"

    invoke-static {v3, p1, v2, v4, v5}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventIntValue(Ljava/lang/String;ILjava/lang/String;J)V

    .line 84
    iget-object v2, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v4, 0x1bc8

    invoke-static {v2, v4}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v2

    .line 85
    const-string v4, "u32_link_type"

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, p1, v4, v2}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 86
    iget-object v2, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v4, 0x1bc7

    invoke-static {v2, v4}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v2

    .line 87
    const-string v4, "u32_channel_type"

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, p1, v4, v2}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 88
    const-string v2, "str_app_version"

    iget-object v4, p0, Lcom/tencent/liteav/b;->e:Ljava/lang/String;

    invoke-static {v3, p1, v2, v4}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 89
    invoke-static {v3, p1}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->nativeReportEvent(Ljava/lang/String;I)V

    .line 90
    iget-boolean p1, p0, Lcom/tencent/liteav/b;->m:Z

    if-eqz p1, :cond_6

    .line 91
    iget-wide v2, p0, Lcom/tencent/liteav/b;->q:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/tencent/liteav/b;->q:J

    .line 92
    iget-wide v2, p0, Lcom/tencent/liteav/b;->p:J

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/tencent/liteav/b;->p:J

    .line 93
    iget-wide v2, p0, Lcom/tencent/liteav/b;->o:J

    cmp-long p1, v0, v2

    if-lez p1, :cond_6

    .line 94
    iput-wide v0, p0, Lcom/tencent/liteav/b;->o:J

    :cond_6
    return-void
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 1

    if-eqz p0, :cond_0

    .line 25
    const-string v0, "myqcloud"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 26
    :cond_0
    invoke-static {}, Lcom/tencent/liteav/basic/d/c;->a()Lcom/tencent/liteav/basic/d/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/liteav/basic/d/c;->a(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e()Ljava/util/HashMap;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/liteav/b;->u:Ljava/util/HashMap;

    return-object v0
.end method

.method public static synthetic f()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/liteav/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method private f(Ljava/lang/String;)V
    .locals 2

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "room://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 4
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    aget-object p1, p1, v0

    .line 5
    const-string v0, "_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 6
    iget-object p1, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const-wide/16 v0, 0x3

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x1bc8

    invoke-static {p1, v1, v0}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;ILjava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private g(Ljava/lang/String;)I
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    if-eqz p1, :cond_0

    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private g()V
    .locals 3

    const/16 v0, 0x1781

    const/16 v1, 0x1782

    const/16 v2, 0x1772

    .line 1
    invoke-virtual {p0, v2, v0, v1}, Lcom/tencent/liteav/b;->a(III)V

    .line 2
    invoke-static {}, Lcom/tencent/liteav/basic/util/e;->a()[I

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/4 v2, 0x0

    aget v0, v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0x2329

    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;ILjava/lang/Object;)Z

    const/16 v0, 0x232a

    const/16 v1, 0x232b

    .line 4
    invoke-virtual {p0, v2, v0, v1}, Lcom/tencent/liteav/b;->a(III)V

    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    invoke-static {}, Lcom/tencent/liteav/basic/util/e;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x232c

    invoke-static {v0, v2, v1}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;ILjava/lang/Object;)Z

    const/16 v0, 0x232d

    const/16 v1, 0x232e

    .line 6
    invoke-virtual {p0, v2, v0, v1}, Lcom/tencent/liteav/b;->a(III)V

    return-void
.end method

.method private h()V
    .locals 10

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    .line 7
    .line 8
    const/16 v2, 0x1bcc

    .line 9
    .line 10
    invoke-static {v1, v2}, Lcom/tencent/liteav/basic/module/TXCStatus;->b(Ljava/lang/String;I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    .line 15
    .line 16
    const/16 v3, 0x1bcd

    .line 17
    .line 18
    invoke-static {v2, v3}, Lcom/tencent/liteav/basic/module/TXCStatus;->b(Ljava/lang/String;I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v3, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    .line 23
    .line 24
    const/16 v4, 0x1bce

    .line 25
    .line 26
    invoke-static {v3, v4}, Lcom/tencent/liteav/basic/module/TXCStatus;->b(Ljava/lang/String;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iget-object v4, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    .line 31
    .line 32
    const/16 v5, 0x1bc1

    .line 33
    .line 34
    invoke-static {v4, v5}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    iget-object v5, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    .line 39
    .line 40
    const/16 v6, 0x1bc2

    .line 41
    .line 42
    invoke-static {v5, v6}, Lcom/tencent/liteav/basic/module/TXCStatus;->b(Ljava/lang/String;I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    iget-object v6, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    .line 47
    .line 48
    const/16 v7, 0x1bc7

    .line 49
    .line 50
    invoke-static {v6, v7}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    const-string v7, "stream_url"

    .line 55
    .line 56
    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    const-string v1, "stream_id"

    .line 60
    .line 61
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    const-string v1, "bizid"

    .line 65
    .line 66
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    const-string v1, "err_code"

    .line 70
    .line 71
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    const-string v1, "err_info"

    .line 79
    .line 80
    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    const-string v1, "channel_type"

    .line 84
    .line 85
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 93
    .line 94
    .line 95
    move-result-wide v1

    .line 96
    iget-wide v3, p0, Lcom/tencent/liteav/b;->n:J

    .line 97
    .line 98
    sub-long v3, v1, v3

    .line 99
    .line 100
    new-instance v5, Ljava/text/SimpleDateFormat;

    .line 101
    .line 102
    const-string v6, "yyyy-MM-dd HH:mm:ss:SSS"

    .line 103
    .line 104
    invoke-direct {v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    new-instance v7, Ljava/util/Date;

    .line 108
    .line 109
    iget-wide v8, p0, Lcom/tencent/liteav/b;->n:J

    .line 110
    .line 111
    invoke-direct {v7, v8, v9}, Ljava/util/Date;-><init>(J)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5, v7}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    const-string v7, "start_time"

    .line 119
    .line 120
    invoke-interface {v0, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    new-instance v5, Ljava/text/SimpleDateFormat;

    .line 124
    .line 125
    invoke-direct {v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    new-instance v6, Ljava/util/Date;

    .line 129
    .line 130
    invoke-direct {v6, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5, v6}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    const-string v2, "end_time"

    .line 138
    .line 139
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    const-string v1, "total_time"

    .line 143
    .line 144
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    iget-object v1, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    .line 152
    .line 153
    const/16 v2, 0x1773

    .line 154
    .line 155
    invoke-static {v1, v2}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    .line 156
    .line 157
    .line 158
    move-result-wide v1

    .line 159
    iget-object v3, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    .line 160
    .line 161
    const/16 v4, 0x1776

    .line 162
    .line 163
    invoke-static {v3, v4}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    .line 164
    .line 165
    .line 166
    move-result-wide v3

    .line 167
    iget-object v5, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    .line 168
    .line 169
    const/16 v6, 0x1775

    .line 170
    .line 171
    invoke-static {v5, v6}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    .line 172
    .line 173
    .line 174
    move-result-wide v5

    .line 175
    const-wide/16 v7, 0x0

    .line 176
    .line 177
    cmp-long v9, v1, v7

    .line 178
    .line 179
    if-eqz v9, :cond_0

    .line 180
    .line 181
    div-long/2addr v3, v1

    .line 182
    goto :goto_0

    .line 183
    :cond_0
    move-wide v3, v7

    .line 184
    :goto_0
    const-string v9, "block_count"

    .line 185
    .line 186
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-interface {v0, v9, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    const-string v1, "block_duration_max"

    .line 194
    .line 195
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    const-string v1, "block_duration_avg"

    .line 203
    .line 204
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    iget-wide v1, p0, Lcom/tencent/liteav/b;->q:J

    .line 212
    .line 213
    cmp-long v3, v1, v7

    .line 214
    .line 215
    if-eqz v3, :cond_1

    .line 216
    .line 217
    iget-wide v3, p0, Lcom/tencent/liteav/b;->p:J

    .line 218
    .line 219
    div-long/2addr v3, v1

    .line 220
    goto :goto_1

    .line 221
    :cond_1
    move-wide v3, v7

    .line 222
    :goto_1
    iget-wide v1, p0, Lcom/tencent/liteav/b;->o:J

    .line 223
    .line 224
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    const-string v2, "jitter_cache_max"

    .line 229
    .line 230
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    const-string v1, "jitter_cache_avg"

    .line 234
    .line 235
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    invoke-static {}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txCreateToken()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    sget v2, Lcom/tencent/liteav/basic/datareport/a;->af:I

    .line 247
    .line 248
    sget v3, Lcom/tencent/liteav/basic/datareport/a;->al:I

    .line 249
    .line 250
    new-instance v4, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;

    .line 251
    .line 252
    invoke-direct {v4}, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;-><init>()V

    .line 253
    .line 254
    .line 255
    const-string v5, "LINKMIC"

    .line 256
    .line 257
    iput-object v5, v4, Lcom/tencent/liteav/basic/datareport/TXCDRExtInfo;->command_id_comment:Ljava/lang/String;

    .line 258
    .line 259
    iget-object v5, p0, Lcom/tencent/liteav/b;->d:Landroid/content/Context;

    .line 260
    .line 261
    invoke-static {v5, v1, v2, v3, v4}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->InitEvent(Landroid/content/Context;Ljava/lang/String;IILcom/tencent/liteav/basic/datareport/TXCDRExtInfo;)V

    .line 262
    .line 263
    .line 264
    sget-object v3, Lcom/tencent/liteav/b;->a:Ljava/lang/String;

    .line 265
    .line 266
    new-instance v4, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 269
    .line 270
    .line 271
    const-string v5, "report evt 40402: token="

    .line 272
    .line 273
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    invoke-static {v3, v4}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    if-eqz v3, :cond_3

    .line 299
    .line 300
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    check-cast v3, Ljava/util/Map$Entry;

    .line 305
    .line 306
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    check-cast v4, Ljava/lang/String;

    .line 311
    .line 312
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    check-cast v3, Ljava/lang/String;

    .line 317
    .line 318
    sget-object v5, Lcom/tencent/liteav/b;->a:Ljava/lang/String;

    .line 319
    .line 320
    new-instance v6, Ljava/lang/StringBuilder;

    .line 321
    .line 322
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 323
    .line 324
    .line 325
    const-string v9, "RealTimePlayStatisticInfo: "

    .line 326
    .line 327
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    const-string v9, " = "

    .line 334
    .line 335
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    invoke-static {v5, v6}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    if-eqz v4, :cond_2

    .line 349
    .line 350
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 351
    .line 352
    .line 353
    move-result v5

    .line 354
    if-lez v5, :cond_2

    .line 355
    .line 356
    if-eqz v3, :cond_2

    .line 357
    .line 358
    invoke-static {v1, v2, v4, v3}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txSetEventValue(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    goto :goto_2

    .line 362
    :cond_3
    invoke-static {v1, v2}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->nativeReportEvent(Ljava/lang/String;I)V

    .line 363
    .line 364
    .line 365
    const/4 v0, 0x0

    .line 366
    iput-boolean v0, p0, Lcom/tencent/liteav/b;->m:Z

    .line 367
    .line 368
    iput-wide v7, p0, Lcom/tencent/liteav/b;->n:J

    .line 369
    .line 370
    iput-wide v7, p0, Lcom/tencent/liteav/b;->q:J

    .line 371
    .line 372
    iput-wide v7, p0, Lcom/tencent/liteav/b;->p:J

    .line 373
    .line 374
    iput-wide v7, p0, Lcom/tencent/liteav/b;->o:J

    .line 375
    .line 376
    return-void
.end method

.method private i()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/tencent/liteav/b;->j:Z

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    iput-wide v1, p0, Lcom/tencent/liteav/b;->k:J

    .line 7
    .line 8
    iput v0, p0, Lcom/tencent/liteav/b;->s:I

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/b;->w:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCCommonUtil;->getUserId()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/tencent/liteav/b;->d:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {v0}, Lcom/tencent/liteav/basic/util/e;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_1
    iget-object v1, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    .line 35
    .line 36
    const-string v2, "str_user_id"

    .line 37
    .line 38
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-static {}, Lcom/tencent/liteav/basic/util/e;->c()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v2, "str_device_type"

    .line 48
    .line 49
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-static {}, Lcom/tencent/liteav/basic/util/e;->c()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    .line 62
    .line 63
    iget-object v1, p0, Lcom/tencent/liteav/b;->d:Landroid/content/Context;

    .line 64
    .line 65
    invoke-static {v1}, Lcom/tencent/liteav/basic/util/e;->c(Landroid/content/Context;)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const-string v2, "u32_network_type"

    .line 74
    .line 75
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    .line 79
    .line 80
    const-string v1, "token"

    .line 81
    .line 82
    invoke-static {}, Lcom/tencent/liteav/basic/util/e;->e()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    .line 90
    .line 91
    iget-object v1, p0, Lcom/tencent/liteav/b;->d:Landroid/content/Context;

    .line 92
    .line 93
    invoke-static {v1}, Lcom/tencent/liteav/basic/util/e;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const-string v2, "str_package_name"

    .line 98
    .line 99
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    .line 103
    .line 104
    iget-object v1, p0, Lcom/tencent/liteav/b;->d:Landroid/content/Context;

    .line 105
    .line 106
    invoke-static {v1}, Lcom/tencent/liteav/basic/util/e;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    const-string v2, "dev_uuid"

    .line 111
    .line 112
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    .line 116
    .line 117
    const-string v1, "str_os_info"

    .line 118
    .line 119
    invoke-static {}, Lcom/tencent/liteav/basic/util/e;->d()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getUtcTimeTick()J

    .line 127
    .line 128
    .line 129
    move-result-wide v0

    .line 130
    iput-wide v0, p0, Lcom/tencent/liteav/b;->r:J

    .line 131
    .line 132
    iget-object v2, p0, Lcom/tencent/liteav/b;->b:Ljava/util/HashMap;

    .line 133
    .line 134
    const-string v3, "u64_timestamp"

    .line 135
    .line 136
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/b;->i()V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lcom/tencent/liteav/b;->g:J

    .line 3
    iput-wide v0, p0, Lcom/tencent/liteav/b;->i:J

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/liteav/b;->n:J

    return-void
.end method

.method public a(III)V
    .locals 7

    const/16 v0, 0x1772

    const-wide v1, 0x3f50624dd2f1a9fcL    # 0.001

    if-ne p1, v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/module/TXCStatus;->d(Ljava/lang/String;I)D

    move-result-wide v3

    cmpg-double p1, v3, v1

    if-gez p1, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/module/TXCStatus;->d(Ljava/lang/String;I)D

    move-result-wide v0

    .line 10
    iget-object p1, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    invoke-static {p1, p3}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    sub-double/2addr v3, v0

    int-to-double v5, p1

    div-double/2addr v3, v5

    add-double/2addr v0, v3

    .line 11
    iget-object v2, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v2, p2, v0}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;ILjava/lang/Object;)Z

    .line 12
    iget-object p2, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p3, p1}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;ILjava/lang/Object;)Z

    return-void

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result p1

    int-to-double v3, p1

    cmpg-double p1, v3, v1

    if-gez p1, :cond_2

    :goto_0
    return-void

    .line 14
    :cond_2
    iget-object p1, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/module/TXCStatus;->d(Ljava/lang/String;I)D

    move-result-wide v0

    .line 15
    iget-object p1, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    invoke-static {p1, p3}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    sub-double/2addr v3, v0

    int-to-double v5, p1

    div-double/2addr v3, v5

    add-double/2addr v0, v3

    .line 16
    iget-object v2, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v2, p2, v0}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;ILjava/lang/Object;)Z

    .line 17
    iget-object p2, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p3, p1}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;ILjava/lang/Object;)Z

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/tencent/liteav/b;->c:Ljava/lang/String;

    .line 7
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/b;->b(Ljava/lang/String;)V

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/tencent/liteav/b;->m:Z

    return-void
.end method

.method public b()V
    .locals 4

    const-wide/16 v0, 0x0

    .line 1
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 2
    iget-boolean v1, p0, Lcom/tencent/liteav/b;->j:Z

    if-eqz v1, :cond_1

    .line 3
    iget-boolean v1, p0, Lcom/tencent/liteav/b;->m:Z

    if-eqz v1, :cond_0

    .line 4
    sget v1, Lcom/tencent/liteav/basic/datareport/a;->Z:I

    invoke-direct {p0, v1}, Lcom/tencent/liteav/b;->b(I)V

    goto :goto_0

    .line 5
    :cond_0
    sget v1, Lcom/tencent/liteav/basic/datareport/a;->W:I

    invoke-direct {p0, v1}, Lcom/tencent/liteav/b;->b(I)V

    goto :goto_0

    .line 6
    :cond_1
    sget-object v1, Lcom/tencent/liteav/b;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "play "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/tencent/liteav/b;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " failed"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-boolean v1, p0, Lcom/tencent/liteav/b;->m:Z

    if-eqz v1, :cond_2

    .line 8
    sget v1, Lcom/tencent/liteav/basic/datareport/a;->X:I

    invoke-direct {p0, v1}, Lcom/tencent/liteav/b;->a(I)V

    goto :goto_0

    .line 9
    :cond_2
    sget v1, Lcom/tencent/liteav/basic/datareport/a;->U:I

    invoke-direct {p0, v1}, Lcom/tencent/liteav/b;->a(I)V

    .line 10
    :goto_0
    iget-boolean v1, p0, Lcom/tencent/liteav/b;->m:Z

    if-eqz v1, :cond_3

    .line 11
    invoke-direct {p0}, Lcom/tencent/liteav/b;->h()V

    .line 12
    :cond_3
    iget-object v1, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v2, 0x1bc3

    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;ILjava/lang/Object;)Z

    .line 13
    iget-object v1, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v2, 0x7f1

    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;ILjava/lang/Object;)Z

    .line 14
    iget-object v1, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v2, 0x1771

    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;ILjava/lang/Object;)Z

    .line 15
    iget-object v1, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v2, 0x1bc0

    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;ILjava/lang/Object;)Z

    .line 16
    iget-object v1, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v2, 0x1bc4

    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;ILjava/lang/Object;)Z

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 17
    :cond_0
    iput-object p1, p0, Lcom/tencent/liteav/b;->t:Ljava/lang/String;

    return-void
.end method

.method public c()Lcom/tencent/liteav/b$a;
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/b;->t:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/tencent/liteav/b$a;->a:Lcom/tencent/liteav/b$a;

    return-object v0

    :catch_0
    move-exception v0

    goto/16 :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    sget-object v0, Lcom/tencent/liteav/b$a;->a:Lcom/tencent/liteav/b$a;

    return-object v0

    .line 6
    :cond_1
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    .line 7
    sget-object v0, Lcom/tencent/liteav/b$a;->a:Lcom/tencent/liteav/b$a;

    return-object v0

    .line 8
    :cond_2
    const-string v3, "rtmp"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "http"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "https"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 9
    sget-object v0, Lcom/tencent/liteav/b$a;->a:Lcom/tencent/liteav/b$a;

    return-object v0

    .line 10
    :cond_3
    invoke-static {v1}, Lcom/tencent/liteav/b;->c(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 11
    sget-object v0, Lcom/tencent/liteav/b$a;->b:Lcom/tencent/liteav/b$a;

    return-object v0

    .line 12
    :cond_4
    invoke-virtual {v0}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 13
    const-string v2, "bizid"

    .line 14
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "txTime"

    .line 15
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "txSecret"

    .line 16
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 17
    :cond_5
    sget-object v0, Lcom/tencent/liteav/b$a;->b:Lcom/tencent/liteav/b$a;

    return-object v0

    .line 18
    :cond_6
    sget-object v0, Lcom/tencent/liteav/b;->u:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 19
    sget-object v0, Lcom/tencent/liteav/b;->u:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/liteav/b$a;

    return-object v0

    .line 20
    :cond_7
    sget-object v0, Lcom/tencent/liteav/b;->u:Ljava/util/HashMap;

    sget-object v2, Lcom/tencent/liteav/b$a;->a:Lcom/tencent/liteav/b$a;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    new-instance v0, Ljava/lang/Thread;

    new-instance v2, Lcom/tencent/liteav/b$1;

    invoke-direct {v2, p0, v1}, Lcom/tencent/liteav/b$1;-><init>(Lcom/tencent/liteav/b;Ljava/lang/String;)V

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 22
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 23
    :goto_0
    sget-object v1, Lcom/tencent/liteav/b;->a:Ljava/lang/String;

    const-string v2, "check stream failed."

    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    :goto_1
    sget-object v0, Lcom/tencent/liteav/b$a;->a:Lcom/tencent/liteav/b$a;

    return-object v0
.end method

.method public d()V
    .locals 13

    .line 2
    invoke-direct {p0}, Lcom/tencent/liteav/b;->g()V

    .line 3
    iget-boolean v0, p0, Lcom/tencent/liteav/b;->j:Z

    const/4 v1, 0x1

    const/16 v2, 0x1388

    const-wide/16 v3, 0x0

    if-nez v0, :cond_2

    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v5, 0x1771

    invoke-static {v0, v5}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v5

    .line 5
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v7, 0x1bc0

    invoke-static {v0, v7}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v7

    .line 6
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v9, 0x7f1

    invoke-static {v0, v9}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v9

    .line 7
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v11, 0x1bc4

    invoke-static {v0, v11}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v11

    cmp-long v0, v5, v3

    if-lez v0, :cond_1

    cmp-long v0, v7, v3

    if-lez v0, :cond_1

    cmp-long v0, v11, v3

    if-lez v0, :cond_1

    cmp-long v0, v9, v3

    if-lez v0, :cond_1

    .line 8
    iget-boolean v0, p0, Lcom/tencent/liteav/b;->m:Z

    if-eqz v0, :cond_0

    sget v0, Lcom/tencent/liteav/basic/datareport/a;->X:I

    goto :goto_0

    :cond_0
    sget v0, Lcom/tencent/liteav/basic/datareport/a;->U:I

    :goto_0
    invoke-direct {p0, v0}, Lcom/tencent/liteav/b;->a(I)V

    .line 9
    iput v2, p0, Lcom/tencent/liteav/b;->l:I

    .line 10
    iput-boolean v1, p0, Lcom/tencent/liteav/b;->j:Z

    .line 11
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v5, 0x1bcf

    invoke-static {v0, v5}, Lcom/tencent/liteav/basic/module/TXCStatus;->b(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 12
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/b;->b(Ljava/lang/String;)V

    .line 13
    :cond_2
    iget v0, p0, Lcom/tencent/liteav/b;->s:I

    const/4 v5, 0x3

    if-lt v0, v5, :cond_4

    iget-boolean v0, p0, Lcom/tencent/liteav/b;->j:Z

    if-nez v0, :cond_4

    .line 14
    iget-boolean v0, p0, Lcom/tencent/liteav/b;->m:Z

    if-eqz v0, :cond_3

    sget v0, Lcom/tencent/liteav/basic/datareport/a;->X:I

    goto :goto_1

    :cond_3
    sget v0, Lcom/tencent/liteav/basic/datareport/a;->U:I

    :goto_1
    invoke-direct {p0, v0}, Lcom/tencent/liteav/b;->a(I)V

    .line 15
    iput v2, p0, Lcom/tencent/liteav/b;->l:I

    .line 16
    iput-boolean v1, p0, Lcom/tencent/liteav/b;->j:Z

    .line 17
    :cond_4
    iget v0, p0, Lcom/tencent/liteav/b;->s:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/tencent/liteav/b;->s:I

    .line 18
    iget-wide v0, p0, Lcom/tencent/liteav/b;->k:J

    cmp-long v0, v0, v3

    if-gtz v0, :cond_5

    .line 19
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/liteav/b;->k:J

    .line 20
    :cond_5
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v0

    iget-wide v3, p0, Lcom/tencent/liteav/b;->k:J

    iget v5, p0, Lcom/tencent/liteav/b;->l:I

    int-to-long v5, v5

    add-long/2addr v3, v5

    cmp-long v0, v0, v3

    if-lez v0, :cond_a

    .line 21
    iget-boolean v0, p0, Lcom/tencent/liteav/b;->m:Z

    if-eqz v0, :cond_6

    .line 22
    sget v0, Lcom/tencent/liteav/basic/datareport/a;->Y:I

    invoke-direct {p0, v0}, Lcom/tencent/liteav/b;->c(I)V

    .line 23
    iput v2, p0, Lcom/tencent/liteav/b;->l:I

    goto :goto_2

    .line 24
    :cond_6
    invoke-virtual {p0}, Lcom/tencent/liteav/b;->c()Lcom/tencent/liteav/b$a;

    move-result-object v0

    sget-object v1, Lcom/tencent/liteav/b$a;->c:Lcom/tencent/liteav/b$a;

    if-ne v0, v1, :cond_7

    goto :goto_3

    .line 25
    :cond_7
    sget v0, Lcom/tencent/liteav/basic/datareport/a;->V:I

    invoke-direct {p0, v0}, Lcom/tencent/liteav/b;->c(I)V

    .line 26
    invoke-static {}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->getStatusReportInterval()I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/b;->l:I

    if-ge v0, v2, :cond_8

    .line 27
    iput v2, p0, Lcom/tencent/liteav/b;->l:I

    .line 28
    :cond_8
    iget v0, p0, Lcom/tencent/liteav/b;->l:I

    const v1, 0x493e0

    if-le v0, v1, :cond_9

    .line 29
    iput v1, p0, Lcom/tencent/liteav/b;->l:I

    .line 30
    :cond_9
    :goto_2
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v1, 0x1774

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/liteav/b;->g:J

    .line 31
    iget-object v0, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    const/16 v1, 0x7d2

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/tencent/liteav/b;->i:J

    .line 32
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/liteav/b;->k:J

    :cond_a
    :goto_3
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/b;->v:Ljava/lang/String;

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/b;->w:Ljava/lang/String;

    return-void
.end method
