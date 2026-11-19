.class public final synthetic Lc2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc2/t;

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(Lc2/t;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/n;->a:Lc2/t;

    iput p2, p0, Lc2/n;->b:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc2/n;->a:Lc2/t;

    iget v1, p0, Lc2/n;->b:F

    invoke-static {v0, v1}, Lc2/t;->d(Lc2/t;F)V

    return-void
.end method
