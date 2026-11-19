.class final Lcn/com/techvision/launchercore/internal/LauncherFlow$Companion$mLauncherFlow$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcn/com/techvision/launchercore/internal/LauncherFlow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcn/com/techvision/launchercore/internal/LauncherFlow;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\u0008\u0000\u0010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "T",
        "Lcn/com/techvision/launchercore/internal/LauncherFlow;",
        "Lcn/com/techvision/launchercore/internal/LauncherFlow$b;",
        "a",
        "()Lcn/com/techvision/launchercore/internal/LauncherFlow;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lcn/com/techvision/launchercore/internal/LauncherFlow$Companion$mLauncherFlow$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcn/com/techvision/launchercore/internal/LauncherFlow$Companion$mLauncherFlow$2;

    invoke-direct {v0}, Lcn/com/techvision/launchercore/internal/LauncherFlow$Companion$mLauncherFlow$2;-><init>()V

    sput-object v0, Lcn/com/techvision/launchercore/internal/LauncherFlow$Companion$mLauncherFlow$2;->a:Lcn/com/techvision/launchercore/internal/LauncherFlow$Companion$mLauncherFlow$2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcn/com/techvision/launchercore/internal/LauncherFlow;
    .locals 1

    .line 1
    new-instance v0, Lcn/com/techvision/launchercore/internal/LauncherFlow;

    .line 2
    .line 3
    invoke-direct {v0}, Lcn/com/techvision/launchercore/internal/LauncherFlow;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherFlow$Companion$mLauncherFlow$2;->a()Lcn/com/techvision/launchercore/internal/LauncherFlow;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
