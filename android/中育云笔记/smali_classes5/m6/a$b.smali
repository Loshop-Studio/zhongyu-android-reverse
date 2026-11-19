.class public Lm6/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm6/a;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lm6/a;


# direct methods
.method public constructor <init>(Lm6/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm6/a$b;->c:Lm6/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {}, La7/j;->b()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lm6/a$b;->c:Lm6/a;

    .line 8
    .line 9
    invoke-virtual {p1}, Lm6/a;->dismiss()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
