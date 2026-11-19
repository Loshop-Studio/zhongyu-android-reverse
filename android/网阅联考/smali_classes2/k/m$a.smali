.class public final Lk/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Lk/e;
    .locals 0

    .line 1
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lk/m$a;->c(Landroid/os/ParcelFileDescriptor;)Lk/e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Landroid/os/ParcelFileDescriptor;)Lk/e;
    .locals 1

    .line 1
    new-instance v0, Lk/m;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lk/m;-><init>(Landroid/os/ParcelFileDescriptor;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
