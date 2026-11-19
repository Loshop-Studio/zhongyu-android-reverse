.class public interface abstract Lt8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt8/f$a;
    }
.end annotation


# static fields
.field public static final a:Lt8/f$a;

.field public static final b:Lt8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lt8/f$a;->a:Lt8/f$a;

    .line 2
    .line 3
    sput-object v0, Lt8/f;->a:Lt8/f$a;

    .line 4
    .line 5
    new-instance v0, Lt8/f$a$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lt8/f$a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lt8/f;->b:Lt8/f;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(ILokhttp3/internal/http2/ErrorCode;)V
.end method

.method public abstract b(ILjava/util/List;)Z
.end method

.method public abstract c(ILjava/util/List;Z)Z
.end method

.method public abstract d(ILokio/BufferedSource;IZ)Z
.end method
