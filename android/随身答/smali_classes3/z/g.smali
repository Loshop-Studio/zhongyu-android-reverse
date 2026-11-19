.class public interface abstract Lz/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/g$a;
    }
.end annotation


# static fields
.field public static final a0:Lz/g$a;

.field public static final b0:Lz/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lz/g$a;->a:Lz/g$a;

    .line 2
    .line 3
    sput-object v0, Lz/g;->a0:Lz/g$a;

    .line 4
    .line 5
    sget-object v0, Lz/e;->d:Lz/e;

    .line 6
    .line 7
    invoke-static {v0}, Lz/h;->a(Lz/e;)Lz/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lz/g;->b0:Lz/g;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public abstract a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end method
