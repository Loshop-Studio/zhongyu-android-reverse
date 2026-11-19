.class public final Lcn/com/techvision/launchercore/internal/LauncherFlow;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcn/com/techvision/launchercore/internal/LauncherFlow$a;,
        Lcn/com/techvision/launchercore/internal/LauncherFlow$b;
    }
.end annotation


# static fields
.field public static final b:Lcn/com/techvision/launchercore/internal/LauncherFlow$a;

.field public static final c:Lkotlin/Lazy;


# instance fields
.field public final a:Lio/reactivex/processors/FlowableProcessor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcn/com/techvision/launchercore/internal/LauncherFlow$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcn/com/techvision/launchercore/internal/LauncherFlow$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcn/com/techvision/launchercore/internal/LauncherFlow;->b:Lcn/com/techvision/launchercore/internal/LauncherFlow$a;

    .line 8
    .line 9
    sget-object v0, Lcn/com/techvision/launchercore/internal/LauncherFlow$Companion$mLauncherFlow$2;->a:Lcn/com/techvision/launchercore/internal/LauncherFlow$Companion$mLauncherFlow$2;

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcn/com/techvision/launchercore/internal/LauncherFlow;->c:Lkotlin/Lazy;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lio/reactivex/processors/PublishProcessor;->create()Lio/reactivex/processors/PublishProcessor;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lio/reactivex/processors/FlowableProcessor;->toSerialized()Lio/reactivex/processors/FlowableProcessor;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "create<T>().toSerialized()"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcn/com/techvision/launchercore/internal/LauncherFlow;->a:Lio/reactivex/processors/FlowableProcessor;

    .line 18
    .line 19
    return-void
.end method

.method public static final synthetic a()Lkotlin/Lazy;
    .locals 1

    .line 1
    sget-object v0, Lcn/com/techvision/launchercore/internal/LauncherFlow;->c:Lkotlin/Lazy;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcn/com/techvision/launchercore/internal/LauncherFlow;->a:Lio/reactivex/processors/FlowableProcessor;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/reactivex/processors/FlowableProcessor;->hasSubscribers()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcn/com/techvision/launchercore/internal/LauncherFlow;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lio/reactivex/subscribers/SerializedSubscriber;

    .line 8
    .line 9
    iget-object v1, p0, Lcn/com/techvision/launchercore/internal/LauncherFlow;->a:Lio/reactivex/processors/FlowableProcessor;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lio/reactivex/subscribers/SerializedSubscriber;-><init>(Ly5/c;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lio/reactivex/subscribers/SerializedSubscriber;->onNext(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/Class;)Lio/reactivex/Flowable;
    .locals 1

    .line 1
    const-string v0, "aClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcn/com/techvision/launchercore/internal/LauncherFlow;->a:Lio/reactivex/processors/FlowableProcessor;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lio/reactivex/Flowable;->ofType(Ljava/lang/Class;)Lio/reactivex/Flowable;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/16 v0, 0x100

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lio/reactivex/Flowable;->onBackpressureBuffer(I)Lio/reactivex/Flowable;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lio/reactivex/Flowable;->onBackpressureLatest()Lio/reactivex/Flowable;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "mBus.ofType(aClass).onBa\u20266).onBackpressureLatest()"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object p1
.end method
