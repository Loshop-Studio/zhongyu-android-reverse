.class public abstract Landroidx/savedstate/serialization/serializers/ParcelableSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lce/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/os/Parcelable;",
        ">",
        "Ljava/lang/Object;",
        "Lce/b;"
    }
.end annotation


# instance fields
.field private final descriptor:Lee/f;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v0, v0, [Lee/f;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x4

    .line 9
    const-string v3, "android.os.Parcelable"

    .line 10
    .line 11
    invoke-static {v3, v0, v1, v2, v1}, Lee/m;->f(Ljava/lang/String;[Lee/f;Lhd/l;ILjava/lang/Object;)Lee/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Landroidx/savedstate/serialization/serializers/ParcelableSerializer;->descriptor:Lee/f;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final deserialize(Lfe/e;)Landroid/os/Parcelable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/e;",
            ")TT;"
        }
    .end annotation

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p1, Landroidx/savedstate/serialization/SavedStateDecoder;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Landroidx/savedstate/serialization/SavedStateDecoder;

    invoke-virtual {p1}, Landroidx/savedstate/serialization/SavedStateDecoder;->getSavedState$savedstate_release()Landroid/os/Bundle;

    move-result-object v0

    .line 4
    invoke-static {v0}, Landroidx/savedstate/SavedStateReader;->constructor-impl(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    .line 5
    invoke-virtual {p1}, Landroidx/savedstate/serialization/SavedStateDecoder;->getKey$savedstate_release()Ljava/lang/String;

    move-result-object p1

    .line 6
    const-class v1, Landroid/os/Parcelable;

    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    move-result-object v1

    invoke-static {v0, p1, v1}, Landroidx/savedstate/SavedStateReader;->getParcelable-impl(Landroid/os/Bundle;Ljava/lang/String;Lod/c;)Landroid/os/Parcelable;

    move-result-object p1

    .line 7
    const-string v0, "null cannot be cast to non-null type T of androidx.savedstate.serialization.serializers.ParcelableSerializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/savedstate/serialization/serializers/ParcelableSerializer;->descriptor:Lee/f;

    invoke-interface {v0}, Lee/f;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/savedstate/serialization/serializers/BuiltInSerializerKt;->decoderErrorMessage(Ljava/lang/String;Lfe/e;)Ljava/lang/String;

    move-result-object p1

    .line 9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic deserialize(Lfe/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/savedstate/serialization/serializers/ParcelableSerializer;->deserialize(Lfe/e;)Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lee/f;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/savedstate/serialization/serializers/ParcelableSerializer;->descriptor:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Lfe/f;Landroid/os/Parcelable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/f;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p1, Landroidx/savedstate/serialization/SavedStateEncoder;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Landroidx/savedstate/serialization/SavedStateEncoder;

    invoke-virtual {p1}, Landroidx/savedstate/serialization/SavedStateEncoder;->getSavedState$savedstate_release()Landroid/os/Bundle;

    move-result-object v0

    .line 4
    invoke-static {v0}, Landroidx/savedstate/SavedStateWriter;->constructor-impl(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    .line 5
    invoke-virtual {p1}, Landroidx/savedstate/serialization/SavedStateEncoder;->getKey$savedstate_release()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p2}, Landroidx/savedstate/SavedStateWriter;->putParcelable-impl(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void

    .line 6
    :cond_0
    iget-object p2, p0, Landroidx/savedstate/serialization/serializers/ParcelableSerializer;->descriptor:Lee/f;

    invoke-interface {p2}, Lee/f;->f()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Landroidx/savedstate/serialization/serializers/BuiltInSerializerKt;->encoderErrorMessage(Ljava/lang/String;Lfe/f;)Ljava/lang/String;

    move-result-object p1

    .line 7
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public bridge synthetic serialize(Lfe/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Landroid/os/Parcelable;

    invoke-virtual {p0, p1, p2}, Landroidx/savedstate/serialization/serializers/ParcelableSerializer;->serialize(Lfe/f;Landroid/os/Parcelable;)V

    return-void
.end method
