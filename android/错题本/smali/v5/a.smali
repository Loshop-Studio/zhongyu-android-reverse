.class public abstract Lv5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/blankj/utilcode/util/a;

.field public static final b:Lio/reactivex/internal/operators/observable/g;

.field public static final c:Lio/reactivex/internal/operators/observable/h;

.field public static final d:Lc8/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/blankj/utilcode/util/a;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Lcom/blankj/utilcode/util/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lv5/a;->a:Lcom/blankj/utilcode/util/a;

    .line 8
    .line 9
    new-instance v0, Lio/reactivex/internal/operators/observable/g;

    .line 10
    .line 11
    const/16 v1, 0x9

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lio/reactivex/internal/operators/observable/g;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lv5/a;->b:Lio/reactivex/internal/operators/observable/g;

    .line 17
    .line 18
    new-instance v0, Lio/reactivex/internal/operators/observable/h;

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lio/reactivex/internal/operators/observable/h;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lv5/a;->c:Lio/reactivex/internal/operators/observable/h;

    .line 24
    .line 25
    new-instance v0, Lc8/c;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lv5/a;->d:Lc8/c;

    .line 31
    .line 32
    return-void
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    throw p0
.end method
