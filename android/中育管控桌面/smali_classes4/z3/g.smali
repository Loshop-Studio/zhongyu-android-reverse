.class public final synthetic Lz3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li1/b;


# instance fields
.field public final synthetic a:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz3/g;->a:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz3/g;->a:Ljava/io/File;

    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;->g(Ljava/io/File;Ljava/lang/Throwable;)V

    return-void
.end method
