.class public final synthetic Lc2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln1/b;


# instance fields
.field public final synthetic a:Lc2/t;

.field public final synthetic b:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Lc2/t;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/o;->a:Lc2/t;

    iput-object p2, p0, Lc2/o;->b:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lc2/o;->a:Lc2/t;

    iget-object v1, p0, Lc2/o;->b:Ljava/io/File;

    invoke-static {v0, v1, p1}, Lc2/t;->c(Lc2/t;Ljava/io/File;Ljava/lang/Throwable;)V

    return-void
.end method
