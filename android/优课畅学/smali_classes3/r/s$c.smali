.class public Lr/s$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/s$c;->a:Landroid/content/res/Resources;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public d(Lr/r;)Lr/n;
    .locals 2

    .line 1
    new-instance p1, Lr/s;

    .line 2
    .line 3
    iget-object v0, p0, Lr/s$c;->a:Landroid/content/res/Resources;

    .line 4
    .line 5
    invoke-static {}, Lr/w;->c()Lr/w;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {p1, v0, v1}, Lr/s;-><init>(Landroid/content/res/Resources;Lr/n;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method
