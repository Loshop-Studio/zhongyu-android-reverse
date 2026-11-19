.class public Lv1/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv1/d;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lv1/d;


# direct methods
.method public constructor <init>(Lv1/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv1/d$b;->a:Lv1/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/d$b;->a:Lv1/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv1/d;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
