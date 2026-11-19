.class public Lv1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lv1/a;


# direct methods
.method public constructor <init>(Lv1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv1/a$a;->a:Lv1/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    .line 1
    iget-object p1, p0, Lv1/a$a;->a:Lv1/a;

    .line 2
    .line 3
    iget v0, p1, Lv1/a;->g:I

    .line 4
    .line 5
    invoke-static {p1, v0}, Lv1/a;->a(Lv1/a;I)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1
.end method
