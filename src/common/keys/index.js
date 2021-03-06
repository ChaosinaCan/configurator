import enUsLocale from './en-us';

export const locales = {
  'en-us': enUsLocale
};

/**
 * @typedef DisplayKey
 * @property {string} key
 * @property {string} label1
 * @property {string} [label2]
 * @property {string} [label3]
 * @property {Object} style
 * @property {string} [custom]
 * @property {Object} [data]
 */

/**
 *
 * @param {import('./predefined').PredefinedKey} firmware
 * @param {*} locale
 * @returns {DisplayKey}
 */
export function mergeKeys(firmware, locale) {
  if (firmware.name === 'fw/clear') return null;
  // const custom = firmware && firmware.name && firmware.name.startsWith('cust/');

  return {
    key: firmware.name,
    label1: locale.label1 || firmware.label,
    label2: locale.label2,
    label3: locale.label3,
    style: firmware.style,
    custom: locale.custom,
    data: locale.data
  };
}
