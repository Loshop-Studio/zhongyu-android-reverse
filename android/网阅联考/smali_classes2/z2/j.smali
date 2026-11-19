.class public interface abstract Lz2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz2/j$a;
    }
.end annotation


# static fields
.field public static final a:Lz2/j;

.field public static final b:Lz2/j$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lz2/j$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lz2/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lz2/j;->b:Lz2/j$a;

    .line 8
    .line 9
    new-instance v0, Lz2/j$a$a;

    .line 10
    .line 11
    invoke-direct {v0}, Lz2/j$a$a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lz2/j;->a:Lz2/j;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public abstract a(ILjava/util/List;)Z
.end method

.method public abstract b(ILjava/util/List;Z)Z
.end method

.method public abstract c(ILokhttp3/internal/http2/ErrorCode;)V
.end method

.method public abstract d(ILokio/BufferedSource;IZ)Z
.end method
