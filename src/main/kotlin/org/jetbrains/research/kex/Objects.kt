package org.jetbrains.research.kex

class UnknownTypeInstantiation() : Throwable()

object Objects {
    /**
     * Allows to create a boolean of unknown value
     */
    @JvmStatic
    fun kexUnknownBoolean(): Boolean {
        throw UnknownTypeInstantiation()
    }

    /**
     * Allows to create a byte of unknown value
     */
    @JvmStatic
    fun kexUnknownByte(): Byte {
        throw UnknownTypeInstantiation()
    }

    /**
     * Allows to create a character of unknown value
     */
    @JvmStatic
    fun kexUnknownChar(): Char {
        throw UnknownTypeInstantiation()
    }

    /**
     * Allows to create a short of unknown value
     */
    @JvmStatic
    fun kexUnknownShort(): Short {
        throw UnknownTypeInstantiation()
    }

    /**
     * Allows to create an integer of unknown value
     */
    @JvmStatic
    fun kexUnknownInt(): Int {
        throw UnknownTypeInstantiation()
    }

    /**
     * Allows to create a long of unknown value
     */
    @JvmStatic
    fun kexUnknownLong(): Long {
        throw UnknownTypeInstantiation()
    }

    /**
     * Allows to create a float of unknown value
     */
    @JvmStatic
    fun kexUnknownFloat(): Float {
        throw UnknownTypeInstantiation()
    }

    /**
     * Allows to create a double of unknown value
     */
    @JvmStatic
    fun kexUnknownDouble(): Double {
        throw UnknownTypeInstantiation()
    }

    /**
     * Allows to create an unknown object of given type <T>
     */
    @JvmStatic
    fun <T> kexUnknown(): T {
        throw UnknownTypeInstantiation()
    }


    /**
     * Allows to create a boolean array of unknown value
     */
    @JvmStatic
    fun kexUnknownBooleanArray(): BooleanArray {
        throw UnknownTypeInstantiation()
    }

    /**
     * Allows to create a byte array of unknown value
     */
    @JvmStatic
    fun kexUnknownByteArray(): ByteArray {
        throw UnknownTypeInstantiation()
    }

    /**
     * Allows to create a character array of unknown value
     */
    @JvmStatic
    fun kexUnknownCharArray(): CharArray {
        throw UnknownTypeInstantiation()
    }

    /**
     * Allows to create a short array of unknown value
     */
    @JvmStatic
    fun kexUnknownShortArray(): ShortArray {
        throw UnknownTypeInstantiation()
    }

    /**
     * Allows to create an integer array of unknown value
     */
    @JvmStatic
    fun kexUnknownIntArray(): IntArray {
        throw UnknownTypeInstantiation()
    }

    /**
     * Allows to create a long array of unknown value
     */
    @JvmStatic
    fun kexUnknownLongArray(): LongArray {
        throw UnknownTypeInstantiation()
    }

    /**
     * Allows to create a float array of unknown value
     */
    @JvmStatic
    fun kexUnknownFloatArray(): FloatArray {
        throw UnknownTypeInstantiation()
    }

    /**
     * Allows to create a double array of unknown value
     */
    @JvmStatic
    fun kexUnknownDoubleArray(): DoubleArray {
        throw UnknownTypeInstantiation()
    }

    /**
     * Allows to create an unknown array of given type <T>
     */
    @JvmStatic
    fun <T> kexUnknownArray(): Array<T> {
        throw UnknownTypeInstantiation()
    }
}