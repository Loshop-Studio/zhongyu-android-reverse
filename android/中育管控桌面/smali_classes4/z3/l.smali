.class public final synthetic Lz3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz3/l;->a:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

    iput p2, p0, Lz3/l;->b:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lz3/l;->a:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

    iget v1, p0, Lz3/l;->b:F

    invoke-static {v0, v1}, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;->h(Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;F)V

    return-void
.end method
