.class public final Lsd/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsd/i0;


# static fields
.field public static final c:Lsd/h1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lsd/h1;

    .line 2
    .line 3
    invoke-direct {v0}, Lsd/h1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsd/h1;->c:Lsd/h1;

    .line 7
    .line 8
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
.method public getCoroutineContext()Lkotlin/coroutines/d;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/coroutines/EmptyCoroutineContext;->c:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 2
    .line 3
    return-object v0
.end method
