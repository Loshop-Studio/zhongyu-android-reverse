.class public final Lk/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk/m$b;,
        Lk/m$a;
    }
.end annotation


# instance fields
.field public final a:Lk/m$b;


# direct methods
.method public constructor <init>(Landroid/os/ParcelFileDescriptor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lk/m$b;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lk/m$b;-><init>(Landroid/os/ParcelFileDescriptor;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lk/m;->a:Lk/m$b;

    .line 10
    .line 11
    return-void
.end method

.method public static c()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk/m;->d()Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public d()Landroid/os/ParcelFileDescriptor;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/m;->a:Lk/m$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk/m$b;->a()Landroid/os/ParcelFileDescriptor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
