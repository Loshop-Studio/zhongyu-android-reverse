.class public Lv2/e$i;
.super Lv2/e$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lv2/e$h;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv2/e$i;->a:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b(Z)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lv2/e$i;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {p1}, Lv2/b;->S(Landroid/content/Context;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
