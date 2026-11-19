.class public final Le4/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le4/g;

.field public static b:Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le4/g;

    .line 2
    .line 3
    invoke-direct {v0}, Le4/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Le4/g;->a:Le4/g;

    .line 7
    .line 8
    const/16 v0, 0x8

    .line 9
    .line 10
    sput v0, Le4/g;->c:I

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;
    .locals 1

    .line 1
    sget-object v0, Le4/g;->b:Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Le4/g;->b:Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Le4/g;->b:Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;

    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
