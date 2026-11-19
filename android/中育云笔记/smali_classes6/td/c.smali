.class public final synthetic Ltd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsd/t0;


# instance fields
.field public final synthetic c:Ltd/f;

.field public final synthetic d:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ltd/f;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltd/c;->c:Ltd/f;

    iput-object p2, p0, Ltd/c;->d:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 2

    .line 1
    iget-object v0, p0, Ltd/c;->c:Ltd/f;

    iget-object v1, p0, Ltd/c;->d:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Ltd/f;->r(Ltd/f;Ljava/lang/Runnable;)V

    return-void
.end method
