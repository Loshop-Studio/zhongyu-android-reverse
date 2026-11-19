package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5810y;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p214z6.InterfaceC6830h;

@Metadata(m5109d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a@\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a@\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\u00040\u0002H\u0080\b¢\u0006\u0004\b\u0006\u0010\n\u001aZ\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0004\u0012\u00020\u00040\u0002H\u0080\b¢\u0006\u0004\b\u0006\u0010\u000f\u001a.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b\u0013\u0010\u0014\u001a.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b\u0015\u0010\u0014\u001a4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0080\u0002¢\u0006\u0004\b\u0013\u0010\u0018\u001a6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0019H\u0080\u0002¢\u0006\u0004\b\u0013\u0010\u001a\u001a4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0080\u0002¢\u0006\u0004\b\u0013\u0010\u001c\u001a4\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0080\u0002¢\u0006\u0004\b\u0015\u0010\u0018\u001a6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0019H\u0080\u0002¢\u0006\u0004\b\u0015\u0010\u001a\u001a4\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0080\u0002¢\u0006\u0004\b\u0015\u0010\u001c\u001a.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0012\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b\u0013\u0010\u001d\u001a.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0012\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b\u0015\u0010\u001d\u001a4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0080\u0002¢\u0006\u0004\b\u0013\u0010\u001e\u001a6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\b2\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0019H\u0080\u0002¢\u0006\u0004\b\u0013\u0010\u001f\u001a4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0080\u0002¢\u0006\u0004\b\u0013\u0010 \u001a4\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0080\u0002¢\u0006\u0004\b\u0015\u0010\u001e\u001a6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\b2\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0019H\u0080\u0002¢\u0006\u0004\b\u0015\u0010\u001f\u001a4\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0080\u0002¢\u0006\u0004\b\u0015\u0010 \u001a.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b\u0013\u0010!\u001a.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b\u0015\u0010!\u001a4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0080\u0002¢\u0006\u0004\b\u0013\u0010\"\u001a6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0019H\u0080\u0002¢\u0006\u0004\b\u0013\u0010#\u001a4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0080\u0002¢\u0006\u0004\b\u0013\u0010$\u001a4\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0080\u0002¢\u0006\u0004\b\u0015\u0010\"\u001a6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0019H\u0080\u0002¢\u0006\u0004\b\u0015\u0010#\u001a4\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0080\u0002¢\u0006\u0004\b\u0015\u0010$\u001a4\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0080\u0004¢\u0006\u0004\b%\u0010\"\u001a4\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0080\u0004¢\u0006\u0004\b%\u0010&\u001aN\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'H\u0080\n¢\u0006\u0004\b\u0013\u0010)\u001aT\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0018\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'0\u0016H\u0080\n¢\u0006\u0004\b\u0013\u0010+\u001aV\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u001a\u0010*\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'0\u0019H\u0080\n¢\u0006\u0004\b\u0013\u0010,\u001aT\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0018\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'0\u001bH\u0080\n¢\u0006\u0004\b\u0013\u0010-\u001aP\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0014\u0010/\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010.H\u0080\n¢\u0006\u0004\b\u0013\u00100\u001aO\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0014\u0010/\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010.H\u0000¢\u0006\u0004\b1\u00100\u001aS\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0018\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'0\u0016H\u0000¢\u0006\u0004\b1\u0010+\u001aU\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u001a\u0010*\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'0\u0019H\u0000¢\u0006\u0004\b1\u0010,\u001aS\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0018\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'0\u001bH\u0000¢\u0006\u0004\b1\u0010-\u001aB\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u00102\u001a\u00028\u0000H\u0080\u0002¢\u0006\u0004\b\u0015\u00103\u001aH\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0080\u0002¢\u0006\u0004\b\u0015\u0010+\u001aJ\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u000e\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0019H\u0080\u0002¢\u0006\u0004\b\u0015\u00105\u001aH\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0080\u0002¢\u0006\u0004\b\u0015\u0010-\u001a/\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00102\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0019\"\u00028\u0000H\u0000¢\u0006\u0004\b6\u00107\u001a\u001b\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0010H\u0000¢\u0006\u0004\b6\u00108\u001a/\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00102\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0019\"\u00028\u0000H\u0000¢\u0006\u0004\b9\u0010:\u001a\u001b\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0010H\u0000¢\u0006\u0004\b9\u0010;\u001a/\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00102\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0019\"\u00028\u0000H\u0000¢\u0006\u0004\b<\u0010:\u001a\u001b\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0010H\u0000¢\u0006\u0004\b<\u0010;\u001aS\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f2*\u0010*\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'0\u0019\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'H\u0000¢\u0006\u0004\b=\u0010>\u001a'\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\fH\u0000¢\u0006\u0004\b=\u0010?\u001aS\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f2*\u0010*\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'0\u0019\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'H\u0000¢\u0006\u0004\b@\u0010>\u001a'\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\fH\u0000¢\u0006\u0004\b@\u0010?\u001a/\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00102\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0019\"\u00028\u0000H\u0001¢\u0006\u0004\bA\u00107\u001a\u001b\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0010H\u0001¢\u0006\u0004\bA\u00108\u001a/\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00102\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0019\"\u00028\u0000H\u0001¢\u0006\u0004\bB\u0010:\u001a\u001b\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0010H\u0001¢\u0006\u0004\bB\u0010;\u001a/\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00102\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0019\"\u00028\u0000H\u0001¢\u0006\u0004\bC\u0010:\u001aS\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f2*\u0010*\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'0\u0019\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'H\u0001¢\u0006\u0004\bD\u0010>\u001aS\u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f2*\u0010*\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'0\u0019\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'H\u0001¢\u0006\u0004\bE\u0010>\u001a%\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000F\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0000¢\u0006\u0004\bG\u0010H\u001a%\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000F\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0000¢\u0006\u0004\bG\u0010I\u001a\u0019\u0010G\u001a\b\u0012\u0004\u0012\u00020K0F*\u00020JH\u0000¢\u0006\u0004\bG\u0010L\u001a%\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0000¢\u0006\u0004\bM\u0010N\u001a%\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0000¢\u0006\u0004\bM\u0010O\u001a\u0019\u0010M\u001a\b\u0012\u0004\u0012\u00020K0\b*\u00020JH\u0000¢\u0006\u0004\bM\u0010P\u001a%\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000Q\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0000¢\u0006\u0004\bR\u0010S\u001a%\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000Q\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0000¢\u0006\u0004\bR\u0010T\u001a\u0019\u0010R\u001a\b\u0012\u0004\u0012\u00020K0\u0001*\u00020JH\u0000¢\u0006\u0004\bR\u0010U\u001a%\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0000¢\u0006\u0004\bV\u0010W\u001a%\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0000¢\u0006\u0004\bV\u0010X\u001a\u0019\u0010V\u001a\b\u0012\u0004\u0012\u00020K0\u0001*\u00020JH\u0000¢\u0006\u0004\bV\u0010U\u001a%\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0000¢\u0006\u0004\bY\u0010W\u001a%\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0000¢\u0006\u0004\bY\u0010X\u001a\u0019\u0010Y\u001a\b\u0012\u0004\u0012\u00020K0\u0001*\u00020JH\u0000¢\u0006\u0004\bY\u0010U\u001a7\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010Z\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010.H\u0000¢\u0006\u0004\b[\u0010\\\u001a7\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010.H\u0000¢\u0006\u0004\b]\u0010^\u001a7\u0010_\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010.H\u0000¢\u0006\u0004\b_\u0010^¨\u0006`"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Lkotlin/Function1;", "", "Ld6/s;", "mutator", "mutate", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;Lr6/c;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Lr6/c;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Lr6/c;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "element", "plus", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "minus", "", "elements", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "Lz6/h;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;Lz6/h;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Lz6/h;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;Lz6/h;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "intersect", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Lkotlin/Pair;", "pair", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Lkotlin/Pair;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "pairs", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;[Lkotlin/Pair;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Lz6/h;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "", "map", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Ljava/util/Map;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "putAll", "key", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "keys", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "persistentListOf", "([Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "persistentSetOf", "([Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "persistentHashSetOf", "persistentMapOf", "([Lkotlin/Pair;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "persistentHashMapOf", "immutableListOf", "immutableSetOf", "immutableHashSetOf", "immutableMapOf", "immutableHashMapOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "toImmutableList", "(Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "(Lz6/h;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "", "", "(Ljava/lang/CharSequence;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "toPersistentList", "(Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Lz6/h;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Ljava/lang/CharSequence;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "toImmutableSet", "(Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "(Lz6/h;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "(Ljava/lang/CharSequence;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "toPersistentSet", "(Ljava/lang/Iterable;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "(Lz6/h;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "toPersistentHashSet", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableMap;", "toImmutableMap", "(Ljava/util/Map;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableMap;", "toPersistentMap", "(Ljava/util/Map;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "toPersistentHashMap", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nextensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,741:1\n41#1:743\n41#1:744\n41#1:745\n41#1:746\n41#1:747\n41#1:748\n31#1:749\n31#1:750\n31#1:751\n31#1:752\n31#1:753\n31#1:754\n31#1:755\n53#1:756\n53#1:757\n53#1:758\n53#1:759\n53#1:760\n53#1:761\n53#1:762\n53#1:763\n41#1:764\n31#1:765\n31#1:766\n1#2:742\n*S KotlinDebug\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n158#1:743\n169#1:744\n180#1:745\n192#1:746\n203#1:747\n214#1:748\n241#1:749\n250#1:750\n259#1:751\n271#1:752\n282#1:753\n293#1:754\n304#1:755\n385#1:756\n394#1:757\n403#1:758\n423#1:759\n432#1:760\n441#1:761\n489#1:762\n505#1:763\n616#1:764\n672#1:765\n701#1:766\n*E\n"})
/* loaded from: classes.dex */
public final class ExtensionsKt {
    @Deprecated(message = "Use persistentHashMapOf instead.", replaceWith = @ReplaceWith(expression = "persistentHashMapOf(*pairs)", imports = {}))
    @NotNull
    public static final <K, V> PersistentMap<K, V> immutableHashMapOf(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        return persistentHashMapOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    @Deprecated(message = "Use persistentHashSetOf instead.", replaceWith = @ReplaceWith(expression = "persistentHashSetOf(*elements)", imports = {}))
    @NotNull
    public static final <E> PersistentSet<E> immutableHashSetOf(@NotNull E... eArr) {
        return persistentHashSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    @Deprecated(message = "Use persistentListOf instead.", replaceWith = @ReplaceWith(expression = "persistentListOf(*elements)", imports = {}))
    @NotNull
    public static final <E> PersistentList<E> immutableListOf(@NotNull E... eArr) {
        return persistentListOf(Arrays.copyOf(eArr, eArr.length));
    }

    @Deprecated(message = "Use persistentMapOf instead.", replaceWith = @ReplaceWith(expression = "persistentMapOf(*pairs)", imports = {}))
    @NotNull
    public static final <K, V> PersistentMap<K, V> immutableMapOf(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        return persistentMapOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    @Deprecated(message = "Use persistentSetOf instead.", replaceWith = @ReplaceWith(expression = "persistentSetOf(*elements)", imports = {}))
    @NotNull
    public static final <E> PersistentSet<E> immutableSetOf(@NotNull E... eArr) {
        return persistentSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    @NotNull
    public static final <E> PersistentSet<E> intersect(@NotNull PersistentSet<? extends E> persistentSet, @NotNull Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return persistentSet.retainAll((Collection<? extends Object>) elements);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        AbstractC5830k.m5330g(builder, "<this>");
        AbstractC5830k.m5330g(elements, "elements");
        builder.retainAll(elements instanceof Collection ? (Collection) elements : AbstractC5805t.m5217D0(elements));
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> PersistentCollection<E> minus(@NotNull PersistentCollection<? extends E> persistentCollection, E e) {
        return persistentCollection.remove((PersistentCollection<? extends E>) e);
    }

    @NotNull
    public static final <T> PersistentSet<T> mutate(@NotNull PersistentSet<? extends T> persistentSet, @NotNull InterfaceC6471c interfaceC6471c) {
        PersistentSet.Builder<? extends T> builder = persistentSet.builder();
        interfaceC6471c.invoke(builder);
        return builder.build();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> persistentHashMapOf(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        PersistentHashMap<K, V> persistentHashMapEmptyOf$runtime_release = PersistentHashMap.INSTANCE.emptyOf$runtime_release();
        AbstractC5830k.m5328e(persistentHashMapEmptyOf$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<K, V> builder = persistentHashMapEmptyOf$runtime_release.builder2();
        AbstractC5785e0.m5154H(builder, pairArr);
        return builder.build2();
    }

    @NotNull
    public static final <E> PersistentSet<E> persistentHashSetOf(@NotNull E... eArr) {
        return PersistentHashSet.INSTANCE.emptyOf$runtime_release().addAll((Collection) AbstractC5802q.m5208u(eArr));
    }

    @NotNull
    public static final <E> PersistentList<E> persistentListOf(@NotNull E... eArr) {
        return UtilsKt.persistentVectorOf().addAll((Collection) AbstractC5802q.m5208u(eArr));
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> persistentMapOf(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        PersistentOrderedMap<K, V> persistentOrderedMapEmptyOf$runtime_release = PersistentOrderedMap.INSTANCE.emptyOf$runtime_release();
        AbstractC5830k.m5328e(persistentOrderedMapEmptyOf$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<K, V> builder = persistentOrderedMapEmptyOf$runtime_release.builder2();
        AbstractC5785e0.m5154H(builder, pairArr);
        return builder.build2();
    }

    @NotNull
    public static final <E> PersistentSet<E> persistentSetOf(@NotNull E... eArr) {
        return PersistentOrderedSet.INSTANCE.emptyOf$runtime_release().addAll((Collection) AbstractC5802q.m5208u(eArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> PersistentCollection<E> plus(@NotNull PersistentCollection<? extends E> persistentCollection, E e) {
        return persistentCollection.add((PersistentCollection<? extends E>) e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> PersistentMap<K, V> putAll(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Map<? extends K, ? extends V> map) {
        AbstractC5830k.m5328e(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll>");
        return persistentMap.putAll((Map<? extends Object, ? extends Object>) map);
    }

    @NotNull
    public static final <T> ImmutableList<T> toImmutableList(@NotNull Iterable<? extends T> iterable) {
        ImmutableList<T> immutableList = iterable instanceof ImmutableList ? (ImmutableList) iterable : null;
        return immutableList == null ? toPersistentList(iterable) : immutableList;
    }

    @NotNull
    public static final <K, V> ImmutableMap<K, V> toImmutableMap(@NotNull Map<K, ? extends V> map) {
        ImmutableMap<K, V> immutableMap = map instanceof ImmutableMap ? (ImmutableMap) map : null;
        if (immutableMap != null) {
            return immutableMap;
        }
        PersistentMap.Builder builder = map instanceof PersistentMap.Builder ? (PersistentMap.Builder) map : null;
        PersistentMap<K, V> persistentMapBuild = builder != null ? builder.build2() : null;
        return persistentMapBuild != null ? persistentMapBuild : persistentMapOf().putAll((Map) map);
    }

    @NotNull
    public static final <T> ImmutableSet<T> toImmutableSet(@NotNull Iterable<? extends T> iterable) {
        ImmutableSet<T> immutableSet = iterable instanceof ImmutableSet ? (ImmutableSet) iterable : null;
        if (immutableSet != null) {
            return immutableSet;
        }
        PersistentSet.Builder builder = iterable instanceof PersistentSet.Builder ? (PersistentSet.Builder) iterable : null;
        PersistentSet persistentSetBuild = builder != null ? builder.build() : null;
        return persistentSetBuild != null ? persistentSetBuild : plus(persistentSetOf(), (Iterable) iterable);
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> toPersistentHashMap(@NotNull Map<K, ? extends V> map) {
        PersistentHashMap persistentHashMap = map instanceof PersistentHashMap ? (PersistentHashMap) map : null;
        if (persistentHashMap != null) {
            return persistentHashMap;
        }
        PersistentHashMapBuilder persistentHashMapBuilder = map instanceof PersistentHashMapBuilder ? (PersistentHashMapBuilder) map : null;
        PersistentHashMap<K, V> persistentHashMapBuild = persistentHashMapBuilder != null ? persistentHashMapBuilder.build2() : null;
        return persistentHashMapBuild != null ? persistentHashMapBuild : PersistentHashMap.INSTANCE.emptyOf$runtime_release().putAll((Map) map);
    }

    @NotNull
    public static final <T> PersistentSet<T> toPersistentHashSet(@NotNull Iterable<? extends T> iterable) {
        PersistentHashSet persistentHashSet = iterable instanceof PersistentHashSet ? (PersistentHashSet) iterable : null;
        if (persistentHashSet != null) {
            return persistentHashSet;
        }
        PersistentHashSetBuilder persistentHashSetBuilder = iterable instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) iterable : null;
        PersistentHashSet persistentHashSetBuild = persistentHashSetBuilder != null ? persistentHashSetBuilder.build() : null;
        return persistentHashSetBuild != null ? persistentHashSetBuild : plus(PersistentHashSet.INSTANCE.emptyOf$runtime_release(), (Iterable) iterable);
    }

    @NotNull
    public static final <T> PersistentList<T> toPersistentList(@NotNull Iterable<? extends T> iterable) {
        PersistentList<T> persistentList = iterable instanceof PersistentList ? (PersistentList) iterable : null;
        if (persistentList != null) {
            return persistentList;
        }
        PersistentList.Builder builder = iterable instanceof PersistentList.Builder ? (PersistentList.Builder) iterable : null;
        PersistentList<T> persistentListBuild = builder != null ? builder.build() : null;
        return persistentListBuild == null ? plus(persistentListOf(), (Iterable) iterable) : persistentListBuild;
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> toPersistentMap(@NotNull Map<K, ? extends V> map) {
        PersistentOrderedMap persistentOrderedMap = map instanceof PersistentOrderedMap ? (PersistentOrderedMap) map : null;
        if (persistentOrderedMap != null) {
            return persistentOrderedMap;
        }
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = map instanceof PersistentOrderedMapBuilder ? (PersistentOrderedMapBuilder) map : null;
        PersistentMap<K, V> persistentMapBuild = persistentOrderedMapBuilder != null ? persistentOrderedMapBuilder.build2() : null;
        return persistentMapBuild == null ? PersistentOrderedMap.INSTANCE.emptyOf$runtime_release().putAll((Map) map) : persistentMapBuild;
    }

    @NotNull
    public static final <T> PersistentSet<T> toPersistentSet(@NotNull Iterable<? extends T> iterable) {
        PersistentOrderedSet persistentOrderedSet = iterable instanceof PersistentOrderedSet ? (PersistentOrderedSet) iterable : null;
        if (persistentOrderedSet != null) {
            return persistentOrderedSet;
        }
        PersistentOrderedSetBuilder persistentOrderedSetBuilder = iterable instanceof PersistentOrderedSetBuilder ? (PersistentOrderedSetBuilder) iterable : null;
        PersistentSet<T> persistentSetBuild = persistentOrderedSetBuilder != null ? persistentOrderedSetBuilder.build() : null;
        return persistentSetBuild == null ? plus(PersistentOrderedSet.INSTANCE.emptyOf$runtime_release(), (Iterable) iterable) : persistentSetBuild;
    }

    @Deprecated(message = "Use persistentListOf instead.", replaceWith = @ReplaceWith(expression = "persistentListOf()", imports = {}))
    @NotNull
    public static final <E> PersistentList<E> immutableListOf() {
        return persistentListOf();
    }

    @Deprecated(message = "Use persistentSetOf instead.", replaceWith = @ReplaceWith(expression = "persistentSetOf()", imports = {}))
    @NotNull
    public static final <E> PersistentSet<E> immutableSetOf() {
        return persistentSetOf();
    }

    @NotNull
    public static final <E> PersistentCollection<E> minus(@NotNull PersistentCollection<? extends E> persistentCollection, @NotNull Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentCollection.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        AbstractC5810y.m5294V(iterable, builder);
        return builder.build();
    }

    @NotNull
    public static final <T> PersistentList<T> mutate(@NotNull PersistentList<? extends T> persistentList, @NotNull InterfaceC6471c interfaceC6471c) {
        PersistentList.Builder<? extends T> builder = persistentList.builder();
        interfaceC6471c.invoke(builder);
        return builder.build();
    }

    @NotNull
    public static final <E> PersistentSet<E> persistentHashSetOf() {
        return PersistentHashSet.INSTANCE.emptyOf$runtime_release();
    }

    @NotNull
    public static final <E> PersistentList<E> persistentListOf() {
        return UtilsKt.persistentVectorOf();
    }

    @NotNull
    public static final <E> PersistentSet<E> persistentSetOf() {
        return PersistentOrderedSet.INSTANCE.emptyOf$runtime_release();
    }

    @NotNull
    public static final <E> PersistentCollection<E> plus(@NotNull PersistentCollection<? extends E> persistentCollection, @NotNull Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentCollection.addAll((Collection<? extends Object>) iterable);
        }
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        AbstractC5810y.m5291S(iterable, builder);
        return builder.build();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> putAll(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        AbstractC5830k.m5328e(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder2();
        AbstractC5785e0.m5153G(builder, iterable);
        return builder.build2();
    }

    @NotNull
    public static final <E> PersistentCollection<E> minus(@NotNull PersistentCollection<? extends E> persistentCollection, @NotNull E[] eArr) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        AbstractC5810y.m5297Y(builder, eArr);
        return builder.build();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> mutate(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull InterfaceC6471c interfaceC6471c) {
        AbstractC5830k.m5328e(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder2();
        interfaceC6471c.invoke(builder);
        return builder.build2();
    }

    @NotNull
    public static final <E> PersistentCollection<E> plus(@NotNull PersistentCollection<? extends E> persistentCollection, @NotNull E[] eArr) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        AbstractC5810y.m5292T(builder, eArr);
        return builder.build();
    }

    @NotNull
    public static final <T> ImmutableList<T> toImmutableList(@NotNull InterfaceC6830h interfaceC6830h) {
        return toPersistentList(interfaceC6830h);
    }

    @NotNull
    public static final <E> PersistentCollection<E> minus(@NotNull PersistentCollection<? extends E> persistentCollection, @NotNull InterfaceC6830h interfaceC6830h) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        AbstractC5810y.m5296X(builder, interfaceC6830h);
        return builder.build();
    }

    @NotNull
    public static final <E> PersistentCollection<E> plus(@NotNull PersistentCollection<? extends E> persistentCollection, @NotNull InterfaceC6830h interfaceC6830h) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        AbstractC5810y.m5290R(builder, interfaceC6830h);
        return builder.build();
    }

    @NotNull
    public static final ImmutableList<Character> toImmutableList(@NotNull CharSequence charSequence) {
        return toPersistentList(charSequence);
    }

    @NotNull
    public static final <T> ImmutableSet<T> toImmutableSet(@NotNull InterfaceC6830h interfaceC6830h) {
        return toPersistentSet(interfaceC6830h);
    }

    @NotNull
    public static final <T> PersistentSet<T> toPersistentHashSet(@NotNull InterfaceC6830h interfaceC6830h) {
        return plus(persistentHashSetOf(), interfaceC6830h);
    }

    @NotNull
    public static final <T> PersistentList<T> toPersistentList(@NotNull InterfaceC6830h interfaceC6830h) {
        return plus(persistentListOf(), interfaceC6830h);
    }

    @NotNull
    public static final <T> PersistentSet<T> toPersistentSet(@NotNull InterfaceC6830h interfaceC6830h) {
        return plus(persistentSetOf(), interfaceC6830h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> PersistentList<E> minus(@NotNull PersistentList<? extends E> persistentList, E e) {
        return persistentList.remove((PersistentList<? extends E>) e);
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> persistentHashMapOf() {
        return PersistentHashMap.INSTANCE.emptyOf$runtime_release();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> persistentMapOf() {
        return PersistentOrderedMap.INSTANCE.emptyOf$runtime_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> PersistentList<E> plus(@NotNull PersistentList<? extends E> persistentList, E e) {
        return persistentList.add((PersistentList<? extends E>) e);
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> putAll(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Pair<? extends K, ? extends V>[] pairArr) {
        AbstractC5830k.m5328e(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder2();
        AbstractC5785e0.m5154H(builder, pairArr);
        return builder.build2();
    }

    @NotNull
    public static final PersistentSet<Character> toImmutableSet(@NotNull CharSequence charSequence) {
        return toPersistentSet(charSequence);
    }

    @NotNull
    public static final PersistentSet<Character> toPersistentHashSet(@NotNull CharSequence charSequence) {
        PersistentSet.Builder builder = persistentHashSetOf().builder();
        AbstractC5855p.m5402j0(charSequence, builder);
        return builder.build();
    }

    @NotNull
    public static final PersistentList<Character> toPersistentList(@NotNull CharSequence charSequence) {
        PersistentList.Builder builder = persistentListOf().builder();
        AbstractC5855p.m5402j0(charSequence, builder);
        return builder.build();
    }

    @NotNull
    public static final PersistentSet<Character> toPersistentSet(@NotNull CharSequence charSequence) {
        PersistentSet.Builder builder = persistentSetOf().builder();
        AbstractC5855p.m5402j0(charSequence, builder);
        return builder.build();
    }

    @NotNull
    public static final <E> PersistentList<E> minus(@NotNull PersistentList<? extends E> persistentList, @NotNull Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentList.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        AbstractC5810y.m5294V(iterable, builder);
        return builder.build();
    }

    @NotNull
    public static final <E> PersistentList<E> plus(@NotNull PersistentList<? extends E> persistentList, @NotNull Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentList.addAll((Collection<? extends Object>) iterable);
        }
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        AbstractC5810y.m5291S(iterable, builder);
        return builder.build();
    }

    @NotNull
    public static final <E> PersistentSet<E> intersect(@NotNull PersistentCollection<? extends E> persistentCollection, @NotNull Iterable<? extends E> iterable) {
        return intersect(toPersistentSet(persistentCollection), (Iterable) iterable);
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> putAll(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull InterfaceC6830h pairs) {
        AbstractC5830k.m5328e(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder2();
        AbstractC5830k.m5330g(builder, "<this>");
        AbstractC5830k.m5330g(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            builder.put((Object) pair.component1(), (Object) pair.component2());
        }
        return builder.build2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> PersistentSet<E> minus(@NotNull PersistentSet<? extends E> persistentSet, E e) {
        return persistentSet.remove((PersistentSet<? extends E>) e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> PersistentSet<E> plus(@NotNull PersistentSet<? extends E> persistentSet, E e) {
        return persistentSet.add((PersistentSet<? extends E>) e);
    }

    @NotNull
    public static final <E> PersistentSet<E> minus(@NotNull PersistentSet<? extends E> persistentSet, @NotNull Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentSet.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        AbstractC5810y.m5294V(iterable, builder);
        return builder.build();
    }

    @NotNull
    public static final <E> PersistentSet<E> plus(@NotNull PersistentSet<? extends E> persistentSet, @NotNull Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentSet.addAll((Collection<? extends Object>) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        AbstractC5810y.m5291S(iterable, builder);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> PersistentMap<K, V> minus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, K k8) {
        AbstractC5830k.m5328e(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus>");
        return persistentMap.remove((PersistentMap<? extends K, ? extends V>) k8);
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> plus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Pair<? extends K, ? extends V> pair) {
        AbstractC5830k.m5328e(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus>");
        return persistentMap.put((PersistentMap<? extends K, ? extends V>) pair.getFirst(), (K) pair.getSecond());
    }

    @NotNull
    public static final <E> PersistentList<E> minus(@NotNull PersistentList<? extends E> persistentList, @NotNull E[] eArr) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        AbstractC5810y.m5297Y(builder, eArr);
        return builder.build();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> plus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        return putAll(persistentMap, iterable);
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> plus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Pair<? extends K, ? extends V>[] pairArr) {
        return putAll(persistentMap, pairArr);
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> plus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull InterfaceC6830h interfaceC6830h) {
        return putAll(persistentMap, interfaceC6830h);
    }

    @NotNull
    public static final <E> PersistentList<E> minus(@NotNull PersistentList<? extends E> persistentList, @NotNull InterfaceC6830h interfaceC6830h) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        AbstractC5810y.m5296X(builder, interfaceC6830h);
        return builder.build();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> plus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Map<? extends K, ? extends V> map) {
        return putAll(persistentMap, map);
    }

    @NotNull
    public static final <E> PersistentList<E> plus(@NotNull PersistentList<? extends E> persistentList, @NotNull E[] eArr) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        AbstractC5810y.m5292T(builder, eArr);
        return builder.build();
    }

    @NotNull
    public static final <E> PersistentSet<E> minus(@NotNull PersistentSet<? extends E> persistentSet, @NotNull E[] eArr) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        AbstractC5810y.m5297Y(builder, eArr);
        return builder.build();
    }

    @NotNull
    public static final <E> PersistentList<E> plus(@NotNull PersistentList<? extends E> persistentList, @NotNull InterfaceC6830h interfaceC6830h) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        AbstractC5810y.m5290R(builder, interfaceC6830h);
        return builder.build();
    }

    @NotNull
    public static final <E> PersistentSet<E> minus(@NotNull PersistentSet<? extends E> persistentSet, @NotNull InterfaceC6830h interfaceC6830h) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        AbstractC5810y.m5296X(builder, interfaceC6830h);
        return builder.build();
    }

    @NotNull
    public static final <E> PersistentSet<E> plus(@NotNull PersistentSet<? extends E> persistentSet, @NotNull E[] eArr) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        AbstractC5810y.m5292T(builder, eArr);
        return builder.build();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> minus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull Iterable<? extends K> iterable) {
        AbstractC5830k.m5328e(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder2();
        AbstractC5810y.m5294V(iterable, builder.keySet());
        return builder.build2();
    }

    @NotNull
    public static final <E> PersistentSet<E> plus(@NotNull PersistentSet<? extends E> persistentSet, @NotNull InterfaceC6830h interfaceC6830h) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        AbstractC5810y.m5290R(builder, interfaceC6830h);
        return builder.build();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> minus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull K[] kArr) {
        AbstractC5830k.m5328e(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder2();
        AbstractC5810y.m5297Y(builder.keySet(), kArr);
        return builder.build2();
    }

    @NotNull
    public static final <K, V> PersistentMap<K, V> minus(@NotNull PersistentMap<? extends K, ? extends V> persistentMap, @NotNull InterfaceC6830h interfaceC6830h) {
        AbstractC5830k.m5328e(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder2();
        AbstractC5810y.m5296X(builder.keySet(), interfaceC6830h);
        return builder.build2();
    }
}
