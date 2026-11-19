.class public final Lwd/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvc/c;


# static fields
.field public static final c:Lwd/j;

.field public static final d:Lkotlin/coroutines/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lwd/j;

    .line 2
    .line 3
    invoke-direct {v0}, Lwd/j;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwd/j;->c:Lwd/j;

    .line 7
    .line 8
    sget-object v0, Lkotlin/coroutines/EmptyCoroutineContext;->c:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 9
    .line 10
    sput-object v0, Lwd/j;->d:Lkotlin/coroutines/d;

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
.method public getContext()Lkotlin/coroutines/d;
    .locals 1

    .line 1
    sget-object v0, Lwd/j;->d:Lkotlin/coroutines/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method
