.class public final synthetic Lz3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz3/f;->a:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lz3/f;->a:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;->k(Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;IF)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
